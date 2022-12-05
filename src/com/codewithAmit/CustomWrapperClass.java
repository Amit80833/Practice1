package com.codewithAmit;

public class CustomWrapperClass {

    private float i;

        CustomWrapperClass(float i){
        this.i=i;
    }

    public float getI() {
        return i;
    }

    public void setI(float i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return Float.toString(i);
    }

}
