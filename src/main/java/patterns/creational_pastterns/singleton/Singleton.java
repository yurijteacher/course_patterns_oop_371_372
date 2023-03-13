package patterns.creational_pastterns.singleton;

public class Singleton {
    private static Singleton instance;

    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


    public void print() {
        System.out.print(this +"\n");
    }
}
