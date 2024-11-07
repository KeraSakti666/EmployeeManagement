package employeemanagement;

/**
 * Kelas Employee menyimpan informasi dasar tentang seorang karyawan.
 */
public class Employee {

    private String name;
    private int age;
    private double salary;

    /**
     * Konstruktor untuk kelas Employee.
     *
     * @param name Nama karyawan
     * @param age Usia karyawan
     * @param salary Gaji karyawan
     */
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    /**
     * Mengembalikan nama karyawan.
     *
     * @return Nama karyawan
     */
    public String getName() {
        return name;
    }

    /**
     * Mengubah nama karyawan.
     *
     * @param name Nama baru karyawan
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Mengembalikan usia karyawan.
     *
     * @return Usia karyawan
     */
    public int getAge() {
        return age;
    }

    /**
     * Mengubah usia karyawan.
     *
     * @param age Usia baru karyawan
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Mengembalikan gaji karyawan.
     *
     * @return Gaji karyawan
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Mengubah gaji karyawan.
     *
     * @param salary Gaji baru karyawan
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
