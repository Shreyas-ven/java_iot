import java.util.Scanner;

public class p4_temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperature;

        System.out.println("Temperature finding device \nEnter the temperature:");
        temperature = sc.nextDouble();

        float result = T_F((float) temperature);
        System.out.println("Temperature in Fahrenheit: " + result);
    }

    static float T_F(float c) {
        float F = (9.0f / 5.0f) * c + 32;
        return F;
    }
}