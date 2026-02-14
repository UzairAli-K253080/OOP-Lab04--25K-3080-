class Product {

    String n;
    double p;

    Product(String n1, double p1) {
        n = n1;
        p = p1;
    }

    static Product inc(Product x) {
        Product y = new Product(x.n, x.p + 100);
        return y;
    }

    void show() {
        System.out.println("Name: " + n);
        System.out.println("Price: " + p);
        System.out.println();
    }

    public static void main(String[] args) {

        Product a = new Product("Mouse", 1500);
        Product b = inc(a);

        a.show();
        b.show();
    }
}