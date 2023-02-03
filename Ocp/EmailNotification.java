package SolidPrinciples.Ocp;

public class EmailNotification implements ViolationOcp {
    @Override
    public void sendOTP() {
        System.out.println("Sent OTP by mail");
    }

    @Override
    public void sendTransactionDetails() {
        System.out.println("Sent Statement by mail");

    }

    @Override
    public void dailyBalance() {
        //have to be deleted.not used.

    }

    public static void main(String[] args) {
        EmailNotification en=new EmailNotification();
        en.dailyBalance();
        en.sendOTP();
        en.sendTransactionDetails();
    }
}
