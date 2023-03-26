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
        System.out.println();

        // Выводы для повышенного уровеня сложности курсовой
        // Проиндексировать зарплаты на 5%
        increaseSalaries(5);
        System.out.println();

        // Найти сотрудника с минимальной зарплатой в отделе 1
        Employee minSalaryEmployee = findMinSalaryEmployeeByDepartment(1);
        System.out.println("Сотрудник с минимальной зарплатой в отделе 1: " + minSalaryEmployee);
        System.out.println();
        // Найти сотрудника с максимальной зарплатой в отделе 3
        Employee maxSalaryEmployee = findMaxSalaryEmployeeByDepartment(3);
        System.out.println("Сотрудник с максимальной зарплатой в отделе 3: " + maxSalaryEmployee);
        System.out.println();
        // Рассчитать сумму затрат на зарплаты в отделе 2
        double department2SalaryCost = calculateDepartmentSalaryCost(2);
        System.out.println("Сумма затрат на зарплаты в отделе 2: " + department2SalaryCost);
        System.out.println();

        // Рассчитать среднюю зарплату в отделе 4
        double department4AverageSalary = calculateDepartmentAverageSalary(4);
        System.out.println("Средняя зарплата в отделе 4: " + department4AverageSalary);
        System.out.println();

        // Проиндексировать зарплаты в отделе 5 на 10%
        increaseDepartmentSalaries(5, 10);
        System.out.println();

        // Вывести всех сотрудников отдела 3
        System.out.println("Сотрудники отдела 3:");
        printDepartmentEmployees(3);
        System.out.println();

        // Вывести сотрудников с зарплатой меньше 30000
        System.out.println("Сотрудники с зарплатой меньше 30000:");
        printEmployeesWithSalaryLessThan(30000);
        System.out.println();
        // Вывести сотрудников с зарплатой больше или равной 45000
        System.out.println("Сотрудники с зарплатой больше или равной 45000:");
        printEmployeesWithSalaryGreaterThanOrEqualTo(45000);
        System.out.println();


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

    public static void increaseSalaries(double percentage) {
        // методы для повышенного сложность курсовой
        for (Employee employee : employees) {
            if (employee != null) {
                double newSalary = employee.getSalary() * (1 + (percentage / 100));
                employee.setSalary(newSalary);
            }
        }
    }
    public static Employee findMinSalaryEmployeeByDepartment(int department) {
        Employee minSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                if (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary()) {
                    minSalaryEmployee = employee;
                }
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findMaxSalaryEmployeeByDepartment(int department) {
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                if (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary()) {
                    maxSalaryEmployee = employee;
                }
            }
        }
        return maxSalaryEmployee;
    }
    public static double calculateDepartmentSalaryCost(int department) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }
    public static double calculateDepartmentAverageSalary(int department) {
        int employeeCount = 0;
        double totalSalary = 0;

        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                totalSalary += employee.getSalary();
                employeeCount++;
            }
        }
        return totalSalary / employeeCount;
    }
    public static void increaseDepartmentSalaries(int department, double percentage) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                double newSalary = employee.getSalary() * (1 + (percentage / 100));
                employee.setSalary(newSalary);
            }
        }
    }
    public static void printDepartmentEmployees(int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println(employee.toString().replace(", department=" + department, ""));
            }
        }
    }
    public static void printEmployeesWithSalaryLessThan(double threshold) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < threshold) {
                System.out.println("ID: " + employee.getId() + ", ФИО: " + employee.getFullName() + ", Зарплата: " + employee.getSalary());
            }
        }
    }
    public static void printEmployeesWithSalaryGreaterThanOrEqualTo(double threshold) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= threshold) {
                System.out.println("ID: " + employee.getId() + ", ФИО: " + employee.getFullName() + ", Зарплата: " + employee.getSalary());
            }
        }
    }
}
