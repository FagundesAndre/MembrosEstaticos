package util;

public class Barter {

    public static double IOF = 0.06;
    public static double dollarToReal(double dollar, double value){
        return value * dollar * (1.0 + IOF);
    }
}