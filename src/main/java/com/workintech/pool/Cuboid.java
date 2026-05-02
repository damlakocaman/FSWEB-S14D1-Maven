package com.workintech.pool;

public class Cuboid extends Rectangle{
    private int height;

    public void setHeight(int height){
        if(height<0){
            height=0;
        }
        this.height=height;
    }

    public Cuboid(int width, int length, int height){
        super(width, length);
        this.height=height;
        
    }

    public int getHeight(){
        return height;
    }

    public double getVolume(){
        return getArea()*height;
    }

}
   