package SolidPrinciples.Lsp;

public class MobileNotification implements Notification,NotificationMessag{
    @Override
    public void sendOTP() {
        System.out.println("OTP sent by message to mobile");
    }

    @Override
    public void sendTransactionDetails() {
        System.out.println("Transaction statement sent to mobile");

    }

    @Override
    public void dailyBalance() {
        System.out.println("Daily balance sent to mobile.");
    }

    public static void main(String[] args) {
        MobileNotification mn=new MobileNotification();
        mn.dailyBalance();
        mn.sendOTP();
        mn.sendTransactionDetails();
    }
}
