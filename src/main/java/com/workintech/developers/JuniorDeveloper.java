package com.workintech.developers;

public class JuniorDeveloper extends Employee{
   public JuniorDeveloper(int id, String name, int salary) {
    super(id, name, salary);
   }
   public void work(){
    System.out.println("JuniorDeveloper is working");
   }
}
