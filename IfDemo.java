/*
Demonstrate the if. 

Call this file IfDemo.java

If determines the flow of program execution based on whether some condition is true or false. Its simplest form is shown here: 
->  if(condition) statement;
Here, condition is a Boolean expression. (A Boolean expressionis one that evaluates to either true or false.) If *condition* is true, then the statment is executed. If *condition* is false, then the statement 
is bypassed. 

Operator    Meaning
<           Less than
<=          Less than or equal
>           Greater than
>=          Greater than or equal
==          Equal to
!=          Not equal

*/




class IfDemo {
    public static void main(String args[]) {
        int a, b, c;

        a = 2;
        b = 3;

        if(a < b) System.out.println("a is less than b");

        //this won't display anything 
        if(a == b) System.out.println("you won't see this");

        System.out.println();

        c = a - b; // c contains -1

        System.out.println("c contians -1");
        if(c >= 0) System.out.println("c is non-negative");
        if(c < 0) System.out.println("c is negative");

        System.out.println();

        c = b - a; //c now contains 1

        System.out.println("c contains 1");
        if(c >= 0) System.out.println("c is non-negative");
        if(c < 0) System.out.println("c is negative");
    }
}
