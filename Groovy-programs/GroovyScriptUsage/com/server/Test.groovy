package com.server

import com.server.MyClass

public class Test2{
	public static void main(String []args){
		
		System.out.println("This is main for test..");
	}
}
 
def obj = new MyClass()
obj.id= 'myId' ; 

obj.setSalary(12000);
obj.salary = 2344;

obj.income= 5600.45;
println("The obj is  "+obj)
println("The obj salary is  ${obj.salary}");

 
println("The obj salary now is  "+obj.salary);
