package SolidPrinciples.Isp;

import SolidPrinciples.Lsp.Notification;

public class MobNotification implements NotificationMessage, Notification {
    @Override
    public void dailyBalance() {
        System.out.println("Daily balance");
    }

    @Override
    public void sendOTP() {
        System.out.println("Sent OTP");

    }

    @Override
    public void sendTransactionDetails() {
        System.out.println("Treanscation message");

    }

    public static void main(String[] args) {
        MobNotification mn=new MobNotification();
        mn.dailyBalance();
        mn.sendOTP();
        mn.sendTransactionDetails();
    }
}
