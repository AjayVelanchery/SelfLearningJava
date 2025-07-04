package June.week4.June30;

public class Employee {
    private int id;
    private String name;
    private String debt;

    public Employee(int id, String name, String debt, long salary) {
        this.id = id;
        this.name = name;
        this.debt = debt;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", debt='" + debt + '\'' +
                ", salary=" + salary +
                '}';
    }

    private long salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDebt() {
        return debt;
    }

    public void setDebt(String debt) {
        this.debt = debt;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
