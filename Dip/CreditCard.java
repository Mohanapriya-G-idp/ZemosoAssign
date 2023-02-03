package SolidPrinciples.Dip;

public class CreditCard implements BankCard {
    @Override
    public void doPayment(long amount) {
        System.out.println("Payment done by Debit Card");
    }
}

