package PST;

public class Singleinheritance {

	public static void main(String[] args) {
		classB1 obj=new classB1();
		obj.CSE();
		
		
		}

}
class classA1{
	void CSE() {
		System.out.println("Information technology");
	}
	
}
class classB1 extends classA1{
	void CSE() {
		System.out.println("Computer science and engineering");
	}
	
}
