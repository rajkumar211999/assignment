package com.selemiumexpress.ioc;

public class Airtel implements sim {

	@Override
	public void calling() {
		System.out.println("calling using airtel mobile");
		
	}

	@Override
	public void data() {
		System.out.println("browsing internet using airtel mobile");
		
	}

	public static void main(String[] args) {
		System.out.println("calling using airtel mobile");
	}
	

}
