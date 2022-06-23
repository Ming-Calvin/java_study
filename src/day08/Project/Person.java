package day08.Project;

public class Person {
	String name;
	int age;
	/*
	* sex-1: 男； 2：女
	* */
	int sex;

	public void study() {
		System.out.println("study");
	}

	public void showAge() {
		System.out.println("age" + age);
	}

	public int addAge(int i) {
		age += i;
		return age;
	}



}
