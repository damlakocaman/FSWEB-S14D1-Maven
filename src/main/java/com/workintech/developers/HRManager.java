package com.workintech.developers;

public class HRManager extends Employee {
   
    private JuniorDeveloper [] juniorDevelopers;
    private MidDeveloper [] midDevelopers;
    private SeniorDeveloper [] seniorDevelopers;

   
    public HRManager(int id, String name, int salary){
    super(id, name, salary);
    juniorDevelopers = new JuniorDeveloper[3];
    midDevelopers = new MidDeveloper[3];
    seniorDevelopers = new SeniorDeveloper[3];
   }

   public void work(){
    System.out.println("HR is working");
   }

   public void addEmployee(JuniorDeveloper juniorDeveloper, int index){
      if(juniorDevelopers[index] != null){
        System.out.print("Bu junior pozisyonu dolu");
        return;
      }

      if(index<0) {
        System.out.println("index degeri hatali");
        return;
      }

      if(index > juniorDevelopers.length - 1){
        System.out.println("index degeri hatali");
      }

      juniorDevelopers[index]= juniorDeveloper;
   }

    public void addEmployee(MidDeveloper midDeveloper, int index){
      if(midDevelopers[index] != null){
        System.out.print("Bu mid pozisyonu dolu");
        return;
      }

      if(index<0) {
        System.out.println("index degeri hatali");
        return;
      }

      if(index > midDevelopers.length - 1){
        System.out.println("index degeri hatali");
      }

      midDevelopers[index]= midDeveloper;
   }

   public void addEmployee(SeniorDeveloper seniorDeveloper, int index){
      if(seniorDevelopers[index] != null){
        System.out.print("Bu senior pozisyonu dolu");
        return;
      }
    
      if(index<0) {
        System.out.println("index degeri hatali");
        return;
      }

      if(index > seniorDevelopers.length - 1){
        System.out.println("index degeri hatali");
      }

      seniorDevelopers[index]= seniorDeveloper;
   }

}
