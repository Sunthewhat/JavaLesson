public class EmployeeTester {
    public static void main(String[] args) {
        FullTimeEmployee john = new FullTimeEmployee();
        john.setFirstname("John");
        john.setLastname("Bravo");
        john.setSalary(10000);

        FullTimeEmployee marry = new FullTimeEmployee("Marry", "Brown", 5800);

        PartTimeEmployee harry = new PartTimeEmployee("Harry", "Potter");
        harry.setWage(30);
        harry.work(30);
        harry.work(15);

        PartTimeEmployee david = new PartTimeEmployee();
        david.setFirstname("David");
        david.setLastname("Gminer");
        david.setWage(15);
        david.work(20);
        david.work(50);

        john.printInfo();
        marry.printInfo();
        harry.printInfo();
        david.printInfo();
    }
}

class Employee {

    // ATTRIBUTE
    private String firstname;
    private String lastname;
    private int employeeId;
    public static int accumulativeCount;

    // CONSTRUCTOR
    public Employee() {
        accumulativeCount++;
        employeeId = accumulativeCount;
    }

    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        accumulativeCount++;
        employeeId = accumulativeCount;
    }

    // METHOD
    // GETTER
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    // SETTER
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void printInfo() {
        System.out.println("Employee name: " + this.getFirstname() + " " + this.getLastname());
        System.out.println("Employee id: " + this.getEmployeeId());
    }
}

class FullTimeEmployee extends Employee {
    private double salary;

    public FullTimeEmployee() {
        super();
    }

    public FullTimeEmployee(String firstname, String lastname) {
        super(firstname, lastname);
    }

    public FullTimeEmployee(String firstname, String lastname, double salary) {
        super(firstname, lastname);
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Salary: " + this.getSalary());
    }
}

class PartTimeEmployee extends Employee {
    private double wage;
    private double accumulativeHour = 0;

    public PartTimeEmployee() {
        super();
    }

    public PartTimeEmployee(String firstname, String lastname) {
        super(firstname, lastname);
    }

    public PartTimeEmployee(String firstname, String lastname, double wage) {
        super(firstname, lastname);
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getAccumulativeHour() {
        return accumulativeHour;
    }

    public void work(int hour) {
        accumulativeHour += (double) hour;
    }

    public double getTotalMoneyPaid() {
        return wage * accumulativeHour;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Total Wage: " + this.getTotalMoneyPaid());
    }
}
