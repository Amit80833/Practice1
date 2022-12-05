package com.codewithAmit;



public class MathsClass3 {

    int  x=8;
    int  y=4;
  public void calculation() {
      //returning max of two value
      System.out.println("max of x and y is:" + Math.max(x, y));

      //returning the min of the two values
      System.out.println("min of the given numbers:" + Math.min(x, y));

      //finding the sqaure root of the given numbers
      System.out.println("square root of x is:"+ Math.sqrt(x));
      System.out.println("Square root of y is:"+ Math.sqrt(y));

      //finding avg of the given numbers
      System.out.println("average of the given numbers is:"+(x+y)/2);

      //finding the power of x to power y
      System.out.println("x to power y is:"+ Math.pow(x,y));

      //printing the log value of the given numbers when the base is 10
      System.out.println("the log value of x with base 10 is"+ Math.log10(x));
      System.out.println("the log value of y with base 10 is"+ Math.log10(y));

      //printing the log value of the given numbers
      System.out.println("the log value of x is:"+ Math.log(x));
      System.out.println("the log value of y is:"+ Math.log(y));

      //retutn the power of 2
      System.out.println("x to the power of 2 is:"+ Math.exp(x));
      System.out.println("y to the power of 2 is:"+ Math.exp(y));







  }

}
