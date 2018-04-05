package com.test;

import java.util.Random;

enum Note{
	MIDDLE_C, C_SHARPE, C_FLAT
}

class Instrument{
	void play(Note n) {
		System.out.println("Instrument.play() " + n);
	}
	@Override
	public String toString() {
		return "Instrument";
	}
	void adjust() {
		System.out.println("Adjusting Instrument");
	}
}

class Wind extends Instrument{
	@Override
	void play(Note n) {
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

class Percussion extends Instrument{
	@Override
	void play(Note n) {
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

class Drum extends Instrument{
	@Override
	void play(Note n) {
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

class Stringed extends Instrument{
	@Override
	void play(Note n) {
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

class Brass extends Wind{
	@Override
	void play(Note n) {
		System.out.println("Brass.play() " + n);
	}
	@Override
	void adjust() {
		System.out.println("Adjusting Brass");
	}
}

class Woodwind extends Wind{
	@Override
	void play(Note n) {
		System.out.println("Woodwind.play() " + n);
	}
	@Override
	public String toString() {
		return "Woodwind";
	}
}

public class Music_6_7_8 {
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
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	public static void tuneAll(Instrument[] e) {
		for(Instrument i : e) {
			tune(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument[] orchestra = {
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind(),
				new Drum()
		};
		tuneAll(orchestra);
		System.out.println(new Instrument());
		System.out.println(randomGen());
	}

}
