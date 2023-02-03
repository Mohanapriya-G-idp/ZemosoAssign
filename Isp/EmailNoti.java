package SolidPrinciples.Isp;

public class EmailNoti implements ViolationIsp{
    @Override
    public void sendOTP() {
        System.out.println("OTP mail");
    }

    @Override
    public void sendTransactionDetails() {
        System.out.println("transaction mail");
    }

    @Override
    public void dailyBalance() {
        //not needed/used.

    }

    public static void main(String[] args) {
        EmailNoti en=new EmailNoti();
        en.sendOTP();
        en.dailyBalance();//not used
        en.sendTransactionDetails();

    }
}
