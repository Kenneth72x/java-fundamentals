/*
Compute your weight on the Moon. 

Call this file Moon.java
*/

class Moon {
    public static void main(String args[]) {
        double earthweight; //weight on Earth
        double moonweight; //weight on Moon

        earthweight = 143;

        moonweight = earthweight * 0.17; 

        System.out.println(earthweight + " earth-pounds is equivalent to  " + moonweight + " moon-pounds.");
    }
}
