package com.tnsif.daynine;

public class Sample {

}

class Demo {
	public Demo() {
		// resource allocate
		System.out.println("In Constructor");
	}

	@Override
	protected void finalize() throws Throwable {
		// resource cleanup code
		System.out.println("In Finalize");
	}

	}