package Class_Properties;

	class Parent_Class implements java.io.Serializable {
		
		 final static void methodParent(){
			System.out.println("Parent mehod");
		}
	}
	public class ABCD extends Parent_Class{
		 
		public static void main(String [] ar){
				
			   Parent_Class obj = new ABCD();
                obj.methodParent();               	
          }
	}	

