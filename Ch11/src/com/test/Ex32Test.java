package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

class PetSequence {
	protected Pet1[] pets = Pet1.createArray(8);
}

public class Ex32Test extends PetSequence implements Iterable<Pet1> {

	public Iterator<Pet1> iterator() {
		return new Iterator<Pet1>() {
			private int index = 0;

			public boolean hasNext() {
				return index < pets.length;
			}

			public Pet1 next() {
				return pets[index++];
			}

			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}

	public Iterable<Pet1> reversed() {
		return new Iterable<Pet1>() {
			public Iterator<Pet1> iterator() {
				return new Iterator<Pet1>() {
					private int current = pets.length - 1;

					public boolean hasNext() {
						return current > -1;
					}

					public Pet1 next() {
						return pets[current--];
					}
				};
			}
		};
	}

	public Iterable<Pet1> randomized() {
		return new Iterable<Pet1>() {
			public Iterator<Pet1> iterator() {
				Random rand = new Random(47);
				List<Pet1> pl = new ArrayList<Pet1>(Arrays.asList(pets));
				Collections.shuffle(pl,rand);
				return pl.iterator();
			}
		};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex32Test nc = new Ex32Test();
		//display(nc.iterator());
		for (Pet1 p : nc.reversed()) {
			System.out.print(p.id() + ":" + p + " ");
		}
		System.out.println();
		for (Pet1 p : nc.randomized()) {
			System.out.print(p.id() + ":" + p + " ");
		}
		System.out.println();
		for (Pet1 p : nc) {
			System.out.print(p.id() + ":" + p + " ");
		}
	}

}
