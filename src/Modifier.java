public class Modifier {

    private double time;
    public double salary;



    public void setTime(double timeGiven){
        this.time = timeGiven;
    }
    public double SalaryByTime(){
        return salary * time;
    }

}
