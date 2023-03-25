public class Main {
    private static Employee[] employees = new Employee[10];
    public static void main(String[] args) {

        // заполнение массива employees
        employees[0] = new Employee("Иванов Иван Иванович", 1, 30000);
        employees[1] = new Employee("Петров Петр Петрович", 2, 40000);
        employees[2] = new Employee("Сидоров Сидор Сидорович", 3, 25000);
        employees[3] = new Employee("Кузнецова Полина Ивановна", 1, 35000);
        employees[4] = new Employee("Смирнов Алексей Андреич", 4, 45000);
        employees[5] = new Employee("Проторенко Ольга Петровна", 2, 35000);
        employees[6] = new Employee("Новенький Дмитрий Владиславыч", 3, 40000);
        employees[7] = new Employee("Морозова Екатерина Васильна", 4, 50000);
        employees[8] = new Employee("Теплов Сергей Семеныч", 5, 35000);
        employees[9] = new Employee("Уменко Анна Владимировна", 5, 45000);
        // Затраты на зарплаты
        System.out.println("Сумма затрат на зарплаты в месяц: " + calculateTotalSalary());
        System.out.println();
        // Сотрудник с минимальной и максимальной зарплатой
        System.out.println("Сотрудник с минимальной зарплатой: " + findMinSalaryEmployee());
        System.out.println();
        System.out.println("Сотрудник с максимальной зарплатой: " + findMaxSalaryEmployee());
        System.out.println();
        // Средняя зарплата
        System.out.println("Средняя зарплата: " + calculateAverageSalary());
        System.out.println();

        // Вывод ФИО всех сотрудников
        printEmployeeNames();
    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }
    public static double calculateTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }
    public static Employee findMinSalaryEmployee() {
        Employee minSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary()) {
                    minSalaryEmployee = employee;
                }
            }
        }
        return minSalaryEmployee;
    }
    public static Employee findMaxSalaryEmployee() {
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary()) {
                    maxSalaryEmployee = employee;
                }
            }
        }
        return maxSalaryEmployee;
    }
    public static double calculateAverageSalary() {
        int employeeCount = 0;
        double totalSalary = 0;

        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
                employeeCount++;
            }
        }
        return totalSalary / employeeCount;
    }

    public static void printEmployeeNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}