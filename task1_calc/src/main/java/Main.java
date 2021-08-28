public class Main {

    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println("sum(2, 52) = " + intsCalc.sum(2, 52));
        System.out.println("mult(10, 22) = " + intsCalc.mult(10, 22));
        System.out.println("pow(2, 10) = " + intsCalc.pow(2, 10));
    }
}
