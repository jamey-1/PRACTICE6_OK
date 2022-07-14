package org.comit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	1-WRITE AN ALGORITHM THAT INVOKES ANOTHER ONE 
//    	AND THE INVOKED ONE PRINT A VALUE.
    	
//    	mainInvoke();
    	
    	
//    	2-WRITE AN ALGORITHM THAT INVOKES ANOTHER ONE TO BE CALLED 
//    	"ADD”, THAT RECEIVES TWO NUMBERS. 
//    	THE "ADD" ALGORITHM MUST ADD THE PARAMETERS. 
//    	THE INVOKING ALGORITHM SHOULD RECEIVE BACK THAT VALUE AND SHOW IT ON SCREEN.
    	
//    	callAdd();
    	
//    	3 - WRITE AN ALGORITHM AND SUB-ALGORITHM. 
//    	WRITE TWO VARIABLES WITH THE SAME NAME 
//    	SO THAT THE COMPILER DOES NOT SHOW AN ERROR.
    	
    	mainMethod();
    }
    
    public static void mainInvoke() {
    	
    	printValue();
    	
    }
    
    public static void printValue() {
    	
    	System.out.println("I can print.");
    	
    }
    
    public static int add(int a, int b) {
		return a + b;
	}
	
	public static void callAdd() {
		int a = 1;
		int b = 2;
		System.out.println(add(a, b));
	}
	
	public static void mainMethod() {
		int theSameName = 1;
		System.out.println("theSameName in mainMethod is: " + theSameName);
		
		subMethod();
	}
	
	public static void subMethod() {
		int theSameName = 2;
		System.out.println("theSameName in subMethod is: " + theSameName);
	}
}
