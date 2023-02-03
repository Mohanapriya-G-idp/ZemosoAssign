package SolidPrinciples.Dip;

public class CardShopping {
    private BankCard bankCard;

    public CardShopping(BankCard bankCard) {
        this.bankCard= bankCard;
    }

    public void shopping(long amount){
        bankCard.doPayment(amount);
    }

    public static void main(String[] args) {
BankCard bankCard=new CreditCard();
CardShopping shop=new CardShopping(bankCard);
shop.shopping(4000);
    }
}

