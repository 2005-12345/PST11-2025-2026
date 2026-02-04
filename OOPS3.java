package PST;

class Fruitsname{
	
	public static void method1(){
		System.out.println("***Programming languages***");
		
		method1a();
		method1b();
		method1c();
		method1d();
	}
	public static void method1a(){
		System.out.println("C");
		
	}
	public static void method1b(){
		System.out.println("C++");
		
	}
	public static void method1c(){
		System.out.println("Java");
		
	}
	public static void method1d(){
		System.out.println("Python");
		
	}
}

public class OOPS3 {

	public static void main(String[] args) {
		
		Fruitsname obj=new Fruitsname();
		obj.method1();
		
		places obj1=new places();
		obj1.method2();
		

	}

}

class places{
	public static void method2() {
		System.out.println("HTML");
		
		method2a();
		method2b();
		method2c();
		method2d();
		
	}
	public static void method2a() {
		System.out.println("R");
		
	}
	public static void method2b() {
		System.out.println("Javascript");
		
	}
	public static void method2c() {
		System.out.println("CSS");
		
	}
	public static void method2d() {
		System.out.println("SQL");
		
	}
	
}
