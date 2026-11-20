public class CompoundInterest {
    // Compound Interest = Principal * (1 + Rate/100)^Time - Principal
    // Total amount to repay = Principal + Compound Interest.
    // (Unlike simple interest, the interest itself earns interest.)
    static double compoundInterest(double principal, double rate, double years) {
        return principal * Math.pow(1 + rate / 100.0, years) - principal;
    }

    static double totalAmount(double principal, double rate, double years) {
        return principal + compoundInterest(principal, rate, years);
    }

    public static void main(String[] args) {
        double principal = 10000, rate = 5, years = 2;
        System.out.println("Principal: " + principal + ", Rate: " + rate + "%, Time: " + years + " years");
        System.out.println("Compound Interest: " + compoundInterest(principal, rate, years));
        System.out.println("Total Amount: " + totalAmount(principal, rate, years));
        System.out.println("CI on 5000 at 8% for 3 years: " + compoundInterest(5000, 8, 3));
    }
}
