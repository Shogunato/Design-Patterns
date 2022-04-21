import SingletonClass.*;

public class SingletonMain {

    public static void main(String[] arg) {

        Singleton s = Singleton.INSTANCE;
        s.setI(47);
        s.show();

        Singleton s2 = Singleton.INSTANCE;
        s2.setI(31);

        s.show();

    }

}