package Interfaces;

public class Employee {
     private double Salary;
     private String Name;
     private int Id;

     public Employee(){

     }

     public Employee(double salary, String name, int id){
         this.Id = id;
         this.Name = name;
         this.Salary = salary;
     }

     public double getSalary(){
         return this.Salary;
     }
     public String getName(){
         return this.Name;
     }
     public int getId(){
         return this.Id;
     }

    public void setId(int id) {
        this.Id = id;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setSalary(double salary) {
        this.Salary = salary;
    }
}
