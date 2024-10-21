abstract class Employee {
    protected String employeeId;
    protected String name;
    protected int yearsWorked;
    protected double salary;

    public Employee(String employeeId, String name, int yearsWorked, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.yearsWorked = yearsWorked;
        this.salary = salary;
    }

    public int calculateVacationDays() {
        int vacationDays = 5 + (yearsWorked * 2);
        return Math.min(vacationDays, 20);
    }
}
