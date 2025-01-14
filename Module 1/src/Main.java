//Aaron Kim 1/14/25
//It seems like the example table from the textbook is using a more precise conversion than 3.279 for meter to foot
//I've been trying to get the same result but they are off by a little bit in 3rd decimal place. 
public class Main {
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        System.out.println("Feet    Meters    |    Meters    Feet");
        System.out.println("--------------------------------------");
        for (int i = 1; i < 11; i++) {
            double meter = 15.0 + (double) i * 5;

            System.out.printf("%-8.1f%-10.3f|    %-10.1f%-10.3f%n",
                    (double) i,
                    footToMeter(i),
                    meter,
                    meterToFoot(meter)
            );
        }
    }
}