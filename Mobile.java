class Mobile {

    String b;
    String m;
    double p;

    Mobile() {
        this("Unknown", "Default", 0);
    }

    Mobile(String b1, String m1) {
        this(b1, m1, 0);
    }

    Mobile(String b1, String m1, double p1) {
        b = b1;
        m = m1;
        p = p1;
    }

    void show() {
        System.out.println("Brand: " + b);
        System.out.println("Model: " + m);
        System.out.println("Price: " + p);
        System.out.println();
    }

    public static void main(String[] args) {

        Mobile a = new Mobile();
        Mobile b = new Mobile("Samsung", "A54");
        Mobile c = new Mobile("Apple", "15 Pro", 350000);

        a.show();
        b.show();
        c.show();
    }
}