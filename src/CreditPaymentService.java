public class CreditPaymentService {
    public int calculate(int credit, double percent, int period) {
        
        double creditPayment = (credit * percent / 1200 * Math.pow(1 + percent / 1200, period)) / (Math.pow(1 + percent / 1200, period) - 1);
        return (int) creditPayment;

    }
}
