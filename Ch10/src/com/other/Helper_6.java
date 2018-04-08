package com.other;

import com.util.Interface1_6;

public class Helper_6{
	protected class HelperInner implements Interface1_6{
		public HelperInner() {}
		@Override
		public void print() {
			System.out.println("Helper.HelperInner.print()");
		}
	}
}
