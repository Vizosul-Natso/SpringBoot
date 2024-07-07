package com.natso.SpringDemo;

public class Alien {
	
	private int age;
	private Computer com;

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}

	public Alien() {
		System.out.println("object created");
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		System.out.println("Age assigned");
	}
	
	public void code(){
		System.out.println("I am coding..");
		com.compile();
	}

}
