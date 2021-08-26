/* 
You can repeatedly execute a sequence of code by creating a loop. Loops are used whenever you need to perfrom a repetitive task because they are much simpler and easier than trying to write the same
statement over and over again. There are quite a few loop constructs that Java supplies. This example focuses on the for-loop. 
    The simplest form of the for-loop is shown here: 
    for(initialization; condition; iteration) statement;
        -The *initialization* portion of the loop sets a loop control variable to an initial value; in other words, this is the variable portion. 
        -The *condition* is a Boolean expression that tests the loop control variable. 
        -If the outcome of that test (the condition) is true, *statement* executes and the for loop continues to *iterate.* If it is false, the loop terminates. 
        -The *iteration* expression determines how the loop control variable is changed each time the loop iterates. Iterate means to repeat.


Demonstrate the for loop.

Call this file IfDemo.java
*/



class ForDemo {
    public static void main(String args[]) {
        int count;
        //for (initialization; condition; iteration) statement will be on the next line
        for (count = 0; count < 5; count++) //<-----This loop iterates five times. 
            System.out.println("This is count: " + count);
        
            System.out.println("Done!");
    }
}

//In the iteration portion of the for-loop, "count = count+1" can be rewritten in a more efficient, professional manner using the ++ operator Java offers to increment by +1 and the -- operator 
//to decrement by -1 thus becoming "count++" instead of "count = count+1"
