package com.lti.model;

public class Calc {
public void add(int num1,int num2) {
	System.out.print("Summation="+(num1+num2));
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
	
	
	public void prints(){
	System.out.print("");
	}
	

}
