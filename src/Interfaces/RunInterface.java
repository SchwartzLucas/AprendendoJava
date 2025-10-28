package Interfaces;

public class RunInterface {
    public static void main(String[] args){
        Employee a = new Employee(3655,"Lucas", 1  );
        Employee b = new Employee(3000, "Paulo", 2);

        EmployeeSalaryComparator compare = new EmployeeSalaryComparator();
        compare.Compare(a,b);
    }
}
