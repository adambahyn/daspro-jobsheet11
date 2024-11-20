import java.util.*;

public class Kubus01 {

    public static double VKubus(int s) {
        double volume = s * s * s;
        return volume;
    }

    public static double LKubus(int s) {
        double luas = 6 * s * s;
        return luas;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sisi kubus(cm): ");
        int s = sc.nextInt();

        System.out.println("Volume Kubus: " + VKubus(s) + " cm^3");
        System.out.println("Luas Permukaan Kubus: " + LKubus(s) + " cm^2");
    }

}
