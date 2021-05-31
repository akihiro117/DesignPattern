package bridge;

public class Main {
    public static void main(String[] args) {
        Payment creditPayment = new Payment(new CreditPayment());
        Payment qrPayment = new Payment(new QrCodePayment());
        CountPaymentAmount countPayment = new CountPaymentAmount(new CreditPayment());
        creditPayment.process();
        qrPayment.process();
        countPayment.countAmount();
    }
}
