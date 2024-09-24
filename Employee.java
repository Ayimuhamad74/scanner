package Scanner;

import java.util.Date;

// Kelas Employee
class Employee {
    // Atribut
    private String nama;
    private double salary;
    private Date TTL;

    public Employee() {
    }

    // Konstruktor
    public Employee(String nama, double salary, Date TTL) {
        this.nama = nama;
        this.salary = salary;
        this.TTL = TTL;
    }

    // Metode getDetail
    public String getDetail() {
        return "Nama: " + nama + "\nGaji: " + salary + "\nTTL: " + TTL;
    }
}

// Kelas Manager yang merupakan turunan dari Employee
class Manager extends Employee {
    // Atribut tambahan
    private String departement;

    // Konstruktor
    public Manager(String nama, double salary, Date TTL, String departement) {
        super(nama, salary, TTL); // Memanggil konstruktor kelas induk (Employee)
        this.departement = departement;
    }

    // Override metode getDetail dari kelas Employee
    @Override
    public String getDetail() {
        return super.getDetail() + "\nDepartemen: " + departement;
    }
}

public class Manager {
    public static void main(String[] args) {
        // Membuat objek Employee
        Employee employee = new Employee("John Doe", 50000.0, new Date());
        System.out.println("Detail Employee:");
        System.out.println(employee.getDetail());

        // Membuat objek Manager
        Manager manager = new Manager("Jane Smith", 75000.0, new Date(), "HR");
        System.out.println("\nDetail Manager:");
        System.out.println(manager.getDetail());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
}
