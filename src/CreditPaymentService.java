public class CreditPaymentService {

    public int calculate(int loanSum, int loanPeriod, double interestRate) {
        int m = loanPeriod * 12;
        double i = interestRate / 12 / 100;
        double annuityRatio = i * (Math.pow((1 + i), m)) / (Math.pow((1 + i), m) - 1);
        int annuity = (int) (annuityRatio * loanSum);

        return annuity;
    }
}
