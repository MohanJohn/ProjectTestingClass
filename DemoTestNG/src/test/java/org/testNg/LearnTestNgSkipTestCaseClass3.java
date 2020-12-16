package org.testNg;

import org.testng.annotations.Test;

public class LearnTestNgSkipTestCaseClass3 {
	
	
@Test(priority=0)
	public  void StartCar() {
		System.out.println("Start the Car ");

	}
@Test(priority=1)
	public  void putFirstGear() {
		System.out.println("First Gear");

	}
@Test(priority=2)
	public  void putsecondGear() {
		System.out.println("Second Gear");

	}
@Test(priority=3)
	public void putThirdGear() {
		System.out.println("Third Gear");

	}
@Test(priority=4)
	public  void putfouthGear() {
		System.out.println("Fouth Gear");

	}
@Test(priority=5,enabled=true)
	public   void TurnOnMusic() {
		System.out.println("Music on");

	}




}
