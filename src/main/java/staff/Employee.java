package staff;

public abstract class Employee {
    private String name;

    private String NI;
    private double salary;
    public Employee(String name, String NI, double salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getNI() {
        return NI;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double raise){
        if (raise >= 0) {
            salary += raise;
            return salary;
        } else return salary;
    }

    public double payBonus(){
        double result = salary * 0.01;
        return result;
    }
}
