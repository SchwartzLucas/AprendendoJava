package Interfaces;

public class EmployeeSalaryComparator implements Comparator{

    public EmployeeSalaryComparator(){ }

    @Override
    public void Compare(Employee employeeA, Employee employeeB) {
        if(employeeA.getSalary() > employeeB.getSalary()){
            System.out.println("O salario de "+ employeeA.getName() + " é de R$" + employeeA.getSalary()+" e é maior que o sálario do "
                    + employeeB.getName() + ", com uma diferença de: " + (employeeA.getSalary() - employeeB.getSalary()));
        } else if(employeeB.getSalary() > employeeA.getSalary()){
            System.out.println("O salario de "+ employeeB.getName() + " é de R$ " + employeeB.getSalary()+" e é maior que o sálario do "
                    + employeeA.getName() + ", com uma diferença de: " + (employeeB.getSalary() - employeeA.getSalary()));
        }else {
            System.out.println("Ambos ganham o mesmo sálario de: " + employeeA.getSalary());
        }
    }
}
