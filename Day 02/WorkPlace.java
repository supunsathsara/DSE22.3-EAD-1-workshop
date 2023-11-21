
class Employee {
    private String name;
    private String EmpID;
    private int baseSalary;

    public Employee(String name, String empID, int baseSalary) {
        this.name = name;
        EmpID = empID;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpID() {
        return EmpID;
    }

    public void setEmpID(String empID) {
        EmpID = empID;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int calculateSalary() {
        return baseSalary;
    }
}

class PartTimeEmployee extends Employee{
    int hourlyRate;
    int hoursWorked;

    public PartTimeEmployee(String name, String empID, int baseSalary, int hourlyRate, int hoursWorked) {
        super(name, empID, baseSalary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public int calculateSalary(){
        return getBaseSalary() + hourlyRate * hoursWorked;
    }
}

class FullTimeEmployee extends Employee{
    int bonus;

    public FullTimeEmployee(String name, String empID, int baseSalary, int bonus) {
        super(name, empID, baseSalary);
        this.bonus = bonus;
    }

    public int calculateSalary(){
        return getBaseSalary() + bonus;
    }
}

/**
 * WorkPlace
 */
public class WorkPlace {

    
}