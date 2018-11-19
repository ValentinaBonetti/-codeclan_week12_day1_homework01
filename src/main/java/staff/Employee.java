package staff;

public abstract class Employee {

    protected String name;
    protected String NI;
    protected Double salary;

    public Employee(String name, String NI, Double salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNI() {
        return NI;
    }

    public Double getSalary() {
        return salary;
    }

    public void raiseSalary(Double salaryRaise){
        if (salaryRaise < 0) {
            throw new IllegalArgumentException("Salary raise cannot be negative.");
        }
        this.salary += salaryRaise;
    }

    public Double payBonus(){
        return this.salary*0.01;
    }
}
