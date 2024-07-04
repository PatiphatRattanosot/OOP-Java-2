package com.npru.se65;

public class TestDrive {

	public static void main(String[] args) {
		HumanBeing hb = new HumanBeing();
		hb.setHeight(180);
		hb.setWeight(75);
		System.out.println(hb.getBmi());
		System.out.println(hb.analyzeBmi());
		
	}

}
