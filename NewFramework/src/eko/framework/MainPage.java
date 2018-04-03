package eko.framework;

public class MainPage {
    private static String title = "Your Account";
    public static boolean IsAt() {

        return Driver.Instance.getTitle().equals(title);
    }
}
