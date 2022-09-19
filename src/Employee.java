public class Employee {
    private int empno;
    private String name;
    private String empDpt;
    private int salary;

    public Employee(int empno, String name, String empDpt, int salary) {
        this.empno = empno;
        this.name = name;
        this.empDpt = empDpt;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno=" + empno +
                ", name='" + name + '\'' +
                ", empDpt='" + empDpt + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpDpt() {
        return empDpt;
    }

    public void setEmpDpt(String empDpt) {
        this.empDpt = empDpt;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
