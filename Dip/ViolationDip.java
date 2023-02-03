package SolidPrinciples.Dip;

public class ViolationDip {

    private CreditC creditC;

    public ViolationDip(CreditC creditC) {
        this.creditC = creditC;
    }


    public void shopping(long amount){
        CreditC.doPaymentBy(amount);
    }

    public static void main(String[] args) {
        CreditC credit=new CreditC();
        ViolationDip shop=new ViolationDip(credit);
        shop.shopping(4000);
}}
