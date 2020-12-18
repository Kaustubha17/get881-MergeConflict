package com.lti.model;

public class Calc {
public void add(int num1,int num2) {
	System.out.print("Sum="+(num1+num2));

}	
	public void multi(int num1,int num2) {
	System.out.print("Multiplication="+(num1*num2));
}	
	
	public void fact(int num){
	int n=1;
		while(num>1){
		n=n*num;
			num--;
		}
		System.out.print(n);
	}
	


public void sub(int num1,int num2) {
	System.out.print("Difference="+(num1-num2));
}


public void printed() {
	System.out.print("New printing");
}

public void test() {
	System.out.print("test printing");
}



public void show() {
	System.out.print("New show");
}
	
	
}

