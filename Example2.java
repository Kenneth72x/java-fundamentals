/*
This demonstrates a variable. 
Call this file Example2.java
*/

class Example2 {
    public static void main(String args[]) {
        //In Java, all variables must be declared before they are used. The type of variable used must be specified; declare THEN define/assign value
        //Example: type var-name; | int is for integers that are whole numbers. 
        //Variables can also be declared on a single line: int myVar1, myVar2;
        int myVar1; //this declares a variable <-----Declare variables. 
        int myVar2; //this declares another variable 

        myVar1 = 1024; //this assigns 1024 to myVar1 <-----Assign a variable with a value.

        System.out.println("myVar1 contains " + myVar1);
        
        myVar2 = myVar1 / 2;

        System.out.print("myVar2 contains myVar1 / 2: ");
        System.out.println(myVar2);
    }
}

//int is an integer value, it holds whole number values. 

