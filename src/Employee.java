public class Employee {
    private static int counter = 0;
    private final int id;
    private String fullName;
    private int department;
    private double salary;

    public Employee(String fullName, int department, double salary) { //конструктор с ФИО, отдел, зп+id счетчик
        this.id = counter++;
        this.fullName = fullName;
        setDepartment(department);
        this.salary = salary;
    }

    // Геттеры
    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
    // Сеттеры
    public void setDepartment(int department) {
        if (department >= 1 && department <= 5) {
            this.department = department;
        } else {
            throw new IllegalArgumentException("Отдел должен быть между 1м и 5м");
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", fullName='" + fullName + "', department=" + department + ", salary=" + salary + '}';
    }
}
