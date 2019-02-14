package Class_Properties;

public class Singleton_Class {
	
	public static void main(String[] a){
		WithoutSingleTon.sc.invokeTheSingleTonConstructorMethod1();
		WithoutSingleTon.sc.invokeTheSingleTonConstructorMethod2();
		WithoutSingleTon.sc.invokeTheSingleTonConstructorMethod3();
	}
	
/*	static Singleton_Class sc = new Singleton_Class(); // static will load into main memory
	
	private Singleton_Class(){ //private Constructor will help to prevent instantiation from outside the class. 
		//but being static in nature will be used globally
		
		System.out.println("In the Sngleton Class Constructor"); 
				
	}
	
	public void invokeTheSingleTonConstructorMethod1(){
		
		System.out.println("inside Method1");
	}
	
	public void invokeTheSingleTonConstructorMethod2(){
		
		System.out.println("inside Method2");
	}
    
	
	public void invokeTheSingleTonConstructorMethod3(){
		
		System.out.println("inside Method3");
	}*/
}
class WithoutSingleTon{
	
	static WithoutSingleTon sc = new WithoutSingleTon(); // static will load into main memory
	
	private WithoutSingleTon(){ //private Constructor will help to prevent instantiation from outside the class. 
		//but  static in nature will be used globally
		
		System.out.println("In the Sngleton Class Constructor"); 
				
	}
	
	public void invokeTheSingleTonConstructorMethod1(){
		
		System.out.println("inside Method1");
	}
	
	public void invokeTheSingleTonConstructorMethod2(){
		
		System.out.println("inside Method2");
	}
    
	
	public void invokeTheSingleTonConstructorMethod3(){
		
		System.out.println("inside Method3");
	}
	
/*	public static void main(String[] a){
		Singleton_Class.sc.invokeTheSingleTonConstructorMethod1();
		Singleton_Class.sc.invokeTheSingleTonConstructorMethod2();
		Singleton_Class.sc.invokeTheSingleTonConstructorMethod3();
	}*/
 
}
