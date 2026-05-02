package com.workintech.cylinder; 

public class Circle {
   private int radius;

   public int getRadius() {
    return radius;

   }

   public Circle(int radius) {
    if(radius<0){
        radius=0;
    }
    this.radius=radius;

   }

    public double getArea(){
        return radius * radius * Math.PI;
    }
}

