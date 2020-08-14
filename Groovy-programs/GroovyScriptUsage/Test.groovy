import com.server.MyClass

public class Test2{
	public static void main(String []args){
		
		System.out.println("This is main for test..");
	}
}
 
def obj = new MyClass()
obj.setId('myId') ; obj.setSalary(12000);
obj.setIncome(5600.45)
println("The obj is  "+obj)
println("The obj salary is  ${obj.salary}");