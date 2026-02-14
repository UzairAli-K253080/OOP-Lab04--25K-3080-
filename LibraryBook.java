class LibraryBook {

    String t;
    double p;

    LibraryBook() {
        t = "Unknown";
        p = 0;
    }

    LibraryBook(String t1) {
        t = t1;
        p = 500;
    }

    LibraryBook(String t1, double p1) {
        t = t1;
        p = p1;
    }

    void show() {
        System.out.println("Title: " + t);
        System.out.println("Price: " + p);
        System.out.println();
    }

    public static void main(String[] args) {

        LibraryBook a = new LibraryBook();
        LibraryBook b = new LibraryBook("Java Basics");
        LibraryBook c = new LibraryBook("OOP Concepts", 800);

        a.show();
        b.show();
        c.show();
    }
}