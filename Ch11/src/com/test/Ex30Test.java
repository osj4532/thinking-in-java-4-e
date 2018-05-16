package com.test;

import java.util.Collection;
import java.util.Iterator;

class Pet1{
	private String name;
	private static int id;
	private int pid;
	private static String[] names = {"Rat","Manx","Cymric","Mutt","Pug"};
	public Pet1(String name) {
		this.name = name;
		pid = id;
		id++;
	}
	public static Pet1[] createArray(int num){
		Pet1[] pets = new Pet1[num];
		int j = 0;
		for(int i = 0; i < num; i++) {
			pets[i] = new Pet1(names[j]);
			j++;
			if(j >= names.length) {
				j = 0;
			}
		}
		return pets;
	}
	public int id() {
		return pid;
	}
	@Override
	public String toString() {
		return name;
	}
}

public class Ex30Test implements Collection<Pet1>{

	private Pet1[] pets = Pet1.createArray(8);
	public int size() {return pets.length;}
	public Iterator<Pet1> iterator(){
		return new Iterator<Pet1>() {
			private int index = 0;
			public boolean hasNext() {
				return index < pets.length;
			}
			public Pet1 next() {return pets[index++];}
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	
	public static void display(Iterator<Pet1> it) {
		while(it.hasNext()) {
			Pet1 p = it.next();
			System.out.print(p.id() + ":" + p + " ");
		}
		System.out.println();
	}
	public static void display(Collection<Pet1> pets) {
		for(Pet1 p : pets)
			System.out.print(p.id() + ":" + p + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex30Test t = new Ex30Test();
		display(t);
		display(t.iterator());
		
	}
	@Override
	public boolean add(Pet1 p) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	@Override
	public boolean addAll(Collection<? extends Pet1> arg0) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		if(this.size() != 0)
			for(Pet1 p : pets)
				p = null;
	}
	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (this.size() == 0) ? true : false;
	}
	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return pets;
	}
	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	
}
