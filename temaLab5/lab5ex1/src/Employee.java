public class Employee {

    /*
    Employee
    - name
    - email
    - hourRate
    - capacity (work hours per day)
    - freeDays (to be reduced from monthly income)

    + calculateDailyIncome() // -> hourRate * capacity
    + calculateMonthlyIncome() // -> calculateDailyIncome() * (21-freeDays)
    */

    private String name;
    private  String email;
    private double hourRate;
    private int capacity;
    private int freeDays;

    public Employee(String name, String email, double hourRate, int capacity, int freeDays){
        this.name=name;
        this.email=email;
        this.capacity=capacity;
        this.hourRate=hourRate;
        this.freeDays=freeDays;
    }

    public double calculateDailyIncome()
    {
        return hourRate*capacity;
    }

    public double calculateMonthlyIncome()
    {
        return calculateDailyIncome()*(21-freeDays);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
