package com.test;

interface Selector{
	boolean end();
	Object current();
	void next();
}

public class Sequence_4 {

	private Object[] items;
	private int next = 0;
	public Sequence_4(int size) {
		items = new Object[size];
	}
	
	public String toString() {
		return "Sequence.toString()";
	}
	
	public void add(Object x) {
		if(next < items.length)
			items[next++] = x;
	}
	private class SequenceSelector implements Selector{
		private int i = 0;
		public boolean end() {
			return i == items.length;
		}
		public Object current() {
			return items[i];
		}
		public void next() {
			if(i < items.length) i++;
		}
		public Sequence_4 getSeq() {
			return Sequence_4.this;
		}
	}
	public Selector selector() {
		return new SequenceSelector();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sequence_4 sequence = new Sequence_4(10);
		for(int i = 0; i < 10; i++) {
			sequence.add(Integer.toString(i));
		}
		Selector selector = sequence.selector();
		while(!selector.end()) {
			System.out.print(selector.current()+" ");
			selector.next();
		}
		
		Sequence_4.SequenceSelector sss = sequence.new SequenceSelector();
		System.out.println(sss.getSeq());
	}

}
