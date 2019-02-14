package Class_Properties;

public class ClassSup {

	ClassSup(){
		System.out.println("Lets see if it gets overriden");
	}
	ClassSup(int a){
		System.out.println("Lets see second method of Super Class gets overriden");
	}
	public static void main(String [] arg){
	System.out.println("ahsbahsxb");
	ClassSup s = new Child();
	ClassSup v = new Child(2);
	Child d = new Child(2);
	}
}
class Child extends ClassSup {
	
Child(){
		System.out.println("I am inside Child class");
	}
Child(int a){
		
}

}

