package employeemanagement;

import java.util.ArrayList;
import java.util.List;

/**
 * Kelas EmployeeManager mengelola daftar karyawan.
 */
public class EmployeeManager {

    private List<Employee> employees;

    /**
     * Konstruktor untuk EmployeeManager.
     */
    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    /**
     * Menambahkan karyawan baru ke daftar.
     *
     * @param employee Karyawan yang akan ditambahkan
     */
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    /**
     * Menampilkan semua karyawan dalam daftar.
     */
    public void displayEmployees() {
        for (Employee emp : employees) {
            System.out.println("Nama: " + emp.getName());
            System.out.println("Usia: " + emp.getAge());
            System.out.println("Gaji: " + emp.getSalary());
            System.out.println("----------------------");
        }
    }
}
