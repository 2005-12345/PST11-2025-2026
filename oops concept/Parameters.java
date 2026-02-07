package PST;
class M{
    
    public static  int Add(int c,int d){
        
        return c+d;
        
    }
    public static  int Sub(int c,int d){
        
        return c-d;
        
    }
    public static  int Multi(int c,int d){
        
        return c*d;
        
    }
    public static  int Div(int c,int d){
        
        return c/d;
        
    }
    public static  int Mod(int c,int d){
        
        return c%d;
        
    }
    
    
    
    
    
    
}


public class Parameters
{
	public static void main(String[] args) {
	    int a=10,b=20;
	    System.out.println(M.Add(a,b));
	    System.out.println(M.Sub(a,b));
	    System.out.println(M.Multi(a,b));
	    System.out.println(M.Div(a,b));
	    System.out.println(M.Mod(a,b));
	     
	    
	    
		
	}
}

