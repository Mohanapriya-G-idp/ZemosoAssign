package SolidPrinciples.Lsp;

public class EmailNotification implements ViolationLsp {
    @Override
    public void sendOTP() {
        System.out.println("OTP sent in mail");
    }

    @Override
    public void sendTransactionDetails() {
        System.out.println("Transaction mail sent");

    }

    @Override
    public void dailyBalance() {
        //not applicable

    }

    public static void main(String[] args) {
        EmailNotification en= new EmailNotification();
        en.dailyBalance();//not used
        en.sendOTP();
        en.sendTransactionDetails();

    }

}
