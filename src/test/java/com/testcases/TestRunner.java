package com.testcases;

import com.mypages.LoginTestThread;

public class TestRunner {
	
	public static void main(String[] args) {
		Thread t1=new LoginTestThread("chrome thread","chrome");
		Thread t2=new LoginTestThread("firefox thread","firefox");
		System.out.println("threads started....");
		t1.start();
		t2.start();
	}

}
