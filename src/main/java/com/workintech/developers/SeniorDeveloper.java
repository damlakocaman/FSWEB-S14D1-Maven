package com.workintech.developers;

public class SeniorDeveloper extends Employee{
   public SeniorDeveloper(int id, String name, int salary) {
    super(id, name, salary);
   }
   public void work(){
    System.out.println("SeniorDeveloper is working");
   }
}
