package com.test;

import java.util.Random;

enum Note{
	MIDDLE_C, C_SHARPE, C_FLAT
}

interface Playable{
	void play(Note n);
}

abstract class Instrument{
	abstract public String toString();
	abstract void adjust();
}

class Wind extends Instrument implements Playable{
	@Override
	public void play(Note n) {
		System.out.println("Wind.play() " + n);
	}
	@Override
	public String toString() {
		return "Wind";
	}
	@Override
	void adjust() {
		System.out.println("Adjusting Wind");
	}
}

class Percussion extends Instrument implements Playable{
	@Override
	public void play(Note n) {
		System.out.println("Percussion.play() " + n);
	}
	@Override
	public String toString() {
		return "Percussion";
	}
	@Override
	void adjust() {
		System.out.println("Adjusting Percussion");
	}
}

class Drum extends Instrument implements Playable{
	@Override
	public void play(Note n) {
		System.out.println("Drum.play() " + n);
	}
	@Override
	public String toString() {
		return "Drum";
	}
	@Override
	void adjust() {
		System.out.println("Adjusting Drum");
	}
}

class Stringed extends Instrument implements Playable{
	@Override
	public void play(Note n) {
		System.out.println("Stringed.play() " + n);
	}
	@Override
	public String toString() {
		return "Stringed";
	}
	@Override
	void adjust() {
		System.out.println("Adjusting Stringed");
	}
}

class Brass extends Wind implements Playable{
	@Override
	public void play(Note n) {
		System.out.println("Brass.play() " + n);
	}
	@Override
	void adjust() {
		System.out.println("Adjusting Brass");
	}
}

class Woodwind extends Wind implements Playable{
	@Override
	public void play(Note n) {
		System.out.println("Woodwind.play() " + n);
	}
	@Override
	public String toString() {
		return "Woodwind";
	}
}

public class InterfaceTest_9_10 {
	public static Instrument randomGen() {
		Random rand = new Random();
		switch(rand.nextInt(5)) {
		default:
		case 0 : return new Wind();
		case 1 : return new Percussion();
		case 2 : return new Stringed();
		case 3 : return new Brass();
		case 4 : return new Woodwind();
		case 5 : return new Drum();
		}
	}
	public static void tune(Playable p) {
		p.play(Note.MIDDLE_C);
	}
	public static void tuneAll(Playable[] e) {
		for(Playable p : e) {
			tune(p);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playable[] orchestra = {
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind(),
				new Drum()
		};
		tuneAll(orchestra);
		
		System.out.println(randomGen());
	}
}
