package com.codewithAmit;

public class ObjectCloning implements Cloneable{
    int id;
    String name;

    ObjectCloning(int id,String name){
        this.id=id;
        this.name=name;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
