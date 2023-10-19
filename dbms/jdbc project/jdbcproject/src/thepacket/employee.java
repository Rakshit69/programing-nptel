package thepacket;

public class employee {
    private int id;
    private String name;
    private String email;
    private int salary;

    public employee(int a, String b, String c, int s) {
        id = a;
        name = b;
        email = c;
        salary = s;
    }
    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return "Employee with id=" + id + " and name=" + name + " has email " + email + " and salary of him is " + salary;
}
}
