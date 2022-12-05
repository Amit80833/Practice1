package com.codewithAmit;

public class WrapperClassExample {

    int a=20;
//autoboxing
    Integer j=Integer.valueOf(a);//converting int into Integer explicitly
    Integer i=a;//autoboxing, now compiler will write Integer.valueOf(a) internally

    //boxing manual
    int x=90;
    Integer y=Integer.valueOf(x);


    //unboxing
    Integer b =new Integer(3);//converting Integer to int
    int l=b.intValue();//converting Integer into int explicitly
    int m=b;

    //autounboxing
    Integer marks2=78;
    int newmarks21=marks2;

    Integer no=90;
    int newno=no;

    int number=324;
    Integer newnumber=Integer.valueOf(number);

}

