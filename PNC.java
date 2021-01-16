package com.package1;

public class PNC {
	
	public static void main(String [] arg){
		
		String word = "MONDAY";
		char[] chars = word.toCharArray();	
		   int n = chars.length;
			while(n > 0){					
				for(int j= 0 ; j< chars.length - 1  ;j++){								    	
					char temp = chars[j];
					chars[j] = chars[j+1];
					chars[j+1] = temp;		       
					}			
				char[] newChar = chars;				
				int m = newChar.length - 1;
				while(m > 1){
					for(int j = 2;j< chars.length - 1 ;j++){					    
						 char temp = newChar[j];
						 newChar[j] = newChar[j+1];
						 newChar[j+1] = temp;					
					}
					char[] newChar1 = newChar;				
					int x = newChar1.length - 1;
					while(x > 2){
						for(int j = 3;j< chars.length - 1 ;j++){
							 char temp = newChar1[j];
							 newChar1[j] = newChar1[j+1];
							 newChar1[j+1] = temp;							
						}					
					
						char[] newChar2 = newChar1;				
						int y = newChar2.length - 1;
						while(y > 3){
							for(int j = 4;j< chars.length - 1 ;j++){
								 char temp = newChar2[j];
								 newChar2[j] = newChar2[j+1];
								 newChar2[j+1] = temp;								 
							}
							
							char[] newChar3 = newChar2;				
							int z = newChar3.length - 1;
							while(z > 4){
								for(int j = 5;j< chars.length - 1 ;j++){
									 char temp = newChar3[j];
									 newChar3[j] = newChar3[j+1];
									 newChar3[j+1] = temp;											
								}	
					 z--;
					 int a = newChar3.length;
						while(a > 1){
						for(int j= 1 ; j< newChar3.length - 1;j++){								    	
							char temp = newChar3[j];
							newChar3[j] = newChar3[j+1];
							newChar3[j+1] = temp;		       
							}
						System.out.print(newChar3);
						System.out.println();
						a--;
						}
					  }								
						y--;
						}
						x--;
					}
					
					m--;
					
				}
				n--;
			}				
	}

	public static char[] insideCycles(char[] chars, int startCount){
		
		char[] newChar = chars;				
		int m = newChar.length - 1;
		while(m > 1){
			for(int j = startCount; j< chars.length - 1 ;j++){
			    //if(chars[j] != chars[0]){
				 char temp = newChar[j];
				 newChar[j] = newChar[j+1];
				 newChar[j+1] = temp;
				//}
			}					
			System.out.print(newChar);
			System.out.println();
			m--;
		}
		return newChar;
	}
	
}
