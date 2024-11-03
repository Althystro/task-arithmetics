public class Main {
    public static void main(String[] args) {

        int amountKWD = 86;
    int amountEuro = 203;
        double kwdToUsd = amountKWD *3.25;
        double usdToKwd = kwdToUsd /3.25;
        double euroToKwd = amountEuro/3.33;
        System.out.println(amountKWD +" KWD = "+ kwdToUsd +" USD");


        System.out.println(amountEuro +" Euro = "+ euroToKwd +" KWD");

        System.out.println("Hello world!");
    }
}