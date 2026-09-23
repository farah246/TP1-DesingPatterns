package rt4.example.Partie4AdapterPattern;

public class Main {

    public static void main(String[] args) {

        PaymentService payment =
                new PaymentAdapter(new OldPaymentSystem());
        payment.pay(250);
    }
}