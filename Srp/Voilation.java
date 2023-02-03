package SolidPrinciples.Srp;

public class Voilation {
    public void deposit(){
        System.out.println("deposited");
    }
    public void withdraw(){
        System.out.println("withdraw");
    }
    public void printPassbook(){
        System.out.println("passbook printed");
    }
    public void getStatement(){
        System.out.println("statement printout done");
    }
    public void getLoanInfo(String loanTy){
        if (loanTy.equals("home")){
            System.out.println("home loan available");
        } else if (loanTy.equals("car")) {
            System.out.println("car loan available");
        } else if (loanTy.equals("gold")) {
            System.out.println("gold loan available");
        }
    }

    public static void main(String[] args) {
        Voilation v=new Voilation();
        v.deposit();
        v.getLoanInfo("car");
        v.getStatement();
        v.printPassbook();
        v.withdraw();
    }
}
