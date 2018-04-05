package com.test;

interface Processor{
	String name();
	Object process(Object input);
}

class Apply{
	public static void process(Processor p, Object s) {
		System.out.println("Using Processor " + p.name());
		System.out.println(p.process(s));
	}
}

class StringMixer{
	public String mix(String str) {
		char[] ca = new char[str.length()];
		if(str.length() % 2 == 0) {
			for(int i = 0; i < str.length(); i = i + 2) {
				ca[i] = str.charAt(i+1);
				ca[i+1] = str.charAt(i);
			}
			return new String(ca);
		}else {
			for(int i = 0; i < str.length()-1; i = i + 2) {
				ca[i] = str.charAt(i+1);
				ca[i+1] = str.charAt(i);
			}
			ca[str.length()-1] = str.charAt(str.length()-1);
			return new String(ca);
		}
	}
}

class StringMixerAdapter implements Processor{
	private StringMixer stringMixer;
	public StringMixerAdapter(StringMixer stringMixer) {
		this.stringMixer = stringMixer;
	}
	public String name() {
		return "StringMixerAdapter";
	}
	public String process(Object input) {
		return stringMixer.mix((String)input);
	}
}

public class AdapterDesignTest_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		Apply.process(new StringMixerAdapter(new StringMixer()), s);
	}

}
