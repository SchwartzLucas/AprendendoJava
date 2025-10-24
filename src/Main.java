//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        caracher c1 = new caracher();

        c1.name = "Lucas";
        c1.level = 14;

        System.out.println(c1.name + " " + c1.level);
        c1.attack();

        caracher c2 = new caracher("Eeve", 25);

        System.out.println(c2.level);
        c2.attack();

        Modifier m1 = new Modifier();
        m1.salary = 30;
        m1.setTime(10);
        System.out.println(m1.SalaryByTime());
    }
}