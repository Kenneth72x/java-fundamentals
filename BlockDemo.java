/*
A code block is a grouping of two or more statements. This is done by enclosing the statements between opening and closing curly braces. 
Example:
if(w < h) { <---start of block
    v = w * h;
    w = 0;
} <---end of block. 
    Here, if w is less than h, both statements inside the code block will be executed. One cannot execute without the other executing. The keypoint 
    here is that whenever you need to logically link two or more statements, you do so by creating a block. 


*/


class BlockDemo {
    public static void main(String args[]) { //remember, this is the main method (or function as it is called in other programming languages.)
        double i, j, d; //first thing you want to do is declare variables using type var-name.

        i = 5; //second thing you want to do is assign values to the variables.
        j =10;

        //the target of this if is a block
        if(i != 0) { // <--- if the condition conrolling the if is true (as it is in this case), the three statements in lines 24-26 will each execute. 
            System.out.println("i does not equal zero"); //lines 24-26 is the target of the entire code block. 
            d = j / i;
            System.out.println("j / i is " + d);
        }
    }
}
