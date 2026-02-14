class Employee {

    int id;
    String n;
    double s;

    Employee(int i, String n1, double s1) {
        id = i;
        n = n1;
        s = s1;
    }

    Employee(Employee e) {
        id = e.id;
        n = e.n;
        s = e.s;
    }

    void show() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + n);
        System.out.println("Salary: " + s);
        System.out.println();
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Ali", 50000);
        Employee e2 = new Employee(e1);

        e2.n = "Ahmed";
        e2.s = 60000;

        e1.show();
        e2.show();
    }
}