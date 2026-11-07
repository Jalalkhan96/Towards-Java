public class SimpleInterest {
    // Simple Interest = (Principal * Rate * Time) / 100
    // Total amount to repay = Principal + Simple Interest.
    static double simpleInterest(double principal, double rate, double years) {
        return (principal * rate * years) / 100.0;
    }

    static double totalAmount(double principal, double rate, double years) {
        return principal + simpleInterest(principal, rate, years);
    }

    public static void main(String[] args) {
        double principal = 10000, rate = 5, years = 2;
        System.out.println("Principal: " + principal + ", Rate: " + rate + "%, Time: " + years + " years");
        System.out.println("Simple Interest: " + simpleInterest(principal, rate, years));
        System.out.println("Total Amount: " + totalAmount(principal, rate, years));
        System.out.println("SI on 5000 at 8% for 3 years: " + simpleInterest(5000, 8, 3));
    }
}
