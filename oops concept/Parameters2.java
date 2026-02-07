package PST;
class Marks1{
    
    public static  int Add(int a,int b){
        return a+b;
        }
    public static  int Add(int a,int b,int c){
        return a+b+c;
        
    }
    
}
    


public class Parameters2
{
	public static void main(String[] args) {
	    int a=2;
	    int b=4;
	    int c=5;
	    
	    System.out.println(Marks1.Add(a,b));
	    System.out.println(Marks1.Add(a,b,c));
	    
	    
	     
	    }
}

