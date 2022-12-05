package com.codewithAmit;

public class WrapperClassExample2 {

    byte b=10;
    short s=5;
    int i=20;
    long l=200;
    double d=3000;
    float f=33.40f;
    char c='p';
    boolean bl=true;

    //autoboxing
    Byte j=b;
    Short k=s;
    Integer m=i;
    Long n=l;
    Double o=d;
    Float p=f;
    Character q=c;
    Boolean r=bl;

    //unboxing
    Integer result=78;
    Float percentage=68.9f;
    Long marks= 800l;
    int newresults=result.intValue();
    float newpercentage=percentage.floatValue();
    long newmarks=marks.longValue();
}
