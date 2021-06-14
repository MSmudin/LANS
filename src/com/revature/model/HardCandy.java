
package com.revature.model;

public class HardCandy extends Candy {

	/* TODO:
	 * Add hardycandy specific fields 
	 * 
	 * add hardcandy specific methods
	 * 
	 * Set up constructor to establish the state of the hardycandy 
	 * 
	 * Override toString
	 * 
	 */
	
	public HardCandy() {
		this.name = "Some kind of hardcandy!";
		this.numberOfCalories = 50.0;
		this.setMySecretCandyNumber(10);
	}
	
	public void printHardCandy() {
		
		System.out.println(this.getName());
		System.out.println(this.getNumberOfCalories());
		System.out.println(this.getMySecretCandyNumber());
	}

	
	public String toString() {
		return "Name"+this.getName()+
				" Calories: "+this.getNumberOfCalories()+
				" SecretNumber "+this.getMySecretCandyNumber();
	}
}