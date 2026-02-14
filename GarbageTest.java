class GarbageTest {

    int x;

    GarbageTest(int a) {
        x = a;
    }

    public static void main(String[] args) {

        GarbageTest a = new GarbageTest(10);
        GarbageTest b = new GarbageTest(20);

        a = b;

        System.out.println("Object eligible for GC created");
    }
}