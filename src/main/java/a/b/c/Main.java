package a.b.c;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 11/26/2018.
 * Project: exectest
 * *******************************
 */
public class Main {
    private static final String MYVAR = System.getProperty("myvar", "dummy");
    public static void main(String[] args) {
        System.out.println("**********************************");
        System.out.println(MYVAR);
        System.out.println("**********************************");
    }
}
