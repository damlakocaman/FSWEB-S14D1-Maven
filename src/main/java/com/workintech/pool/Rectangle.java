package com.workintech.pool;

public class Rectangle {
   private int width;
   private int length;
   

   public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
       
    }

   public void setWidth(int width){
    if(width < 0) {
        width=0;
  
    }

    this.width=width;

   }

   public void setLength(int length){
    if(length<0){
        length=0;

    }
    this.length=length;

   }

   public int getLength(){
    return length;
   }

   public int getWidth() {
    return width;

   }

   public double getArea(){
    return width*length;
   }
}
