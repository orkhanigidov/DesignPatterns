package singleton.pattern;

public class Main {

    public static void main(String[] args) {

        SimpleSingleton ob1 = SimpleSingleton.getInstance();
        SimpleSingleton ob2 = SimpleSingleton.getInstance();
        System.out.println(ob1 + "\n" + ob2);

        AdvancedSingleton ob3 = AdvancedSingleton.getInstance();
        AdvancedSingleton ob4 = AdvancedSingleton.getInstance();
        System.out.println(ob3 + "\n" + ob4);

    }
}
