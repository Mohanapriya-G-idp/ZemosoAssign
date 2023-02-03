package SolidPrinciples.Srp;

public class BankLoan {
    public void getLoanInfo(String loanTy){
        if (loanTy.equals("home")){
            System.out.println("home loan available");
        } else if (loanTy.equals("car")) {
            System.out.println("car loan available");
        } else if (loanTy.equals("gold")) {
            System.out.println("gold loan available");
        }
    }
}
