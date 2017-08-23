package singleton.pattern;

public class AdvancedSingleton {

    private static AdvancedSingleton instance = null;

    private static Object lock = new Object();

    public static AdvancedSingleton getInstance() {

        if (instance == null) {

            synchronized (lock) {
                if (instance == null) {
                    instance = new AdvancedSingleton();
                }
            }

        }

        return instance;
    }

    public void printClass() {
        System.out.println(this);
    }
}
