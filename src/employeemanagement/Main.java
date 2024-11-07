/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement;

/**
 * Kelas Main menjalankan program Employee Management.
 */
public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        Employee emp1 = new Employee("Alice", 30, 50000);
        Employee emp2 = new Employee("Bob", 25, 45000);

        manager.addEmployee(emp1);
        manager.addEmployee(emp2);

        manager.displayEmployees();
    }
}
