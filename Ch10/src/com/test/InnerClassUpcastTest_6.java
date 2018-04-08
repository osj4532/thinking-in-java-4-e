package com.test;

import com.other.Helper_6;
import com.util.Interface1_6;

public class InnerClassUpcastTest_6 extends Helper_6{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Helper_6 helper = new Helper_6();
		Interface1_6 inner = helper.new HelperInner();
		inner.print();
	}

}
