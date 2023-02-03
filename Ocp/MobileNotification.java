package SolidPrinciples.Ocp;

import SolidPrinciples.Isp.NotificationMessage;

public class MobileNotification implements NotificationService,NotificationMessage {
    @Override
    public void sendOTP() {
        System.out.println("Sent OTP by Mobile");
    }

    @Override
    public void sendTransactionDetails() {
        System.out.println("Transaction message sent for Mobile");
    }

    @Override
    public void dailyBalance() {
        System.out.println("Daily balance message sent");
    }

    public static void main(String[] args) {
        MobileNotification mn=new MobileNotification();
        mn.dailyBalance();
        mn.sendOTP();
        mn.sendTransactionDetails();
    }
    }

