package br.com.matheusbespalec.springdi.notification;

import br.com.matheusbespalec.springdi.domain.Customer;

public class NotificationEmail implements Notification {
    private Boolean isUppercase;
    private String smtpServerHost;

    public NotificationEmail(String smtpServerHost) {
        this.smtpServerHost = smtpServerHost;
        System.out.println("Bean NotificationEmail");
    }

    public void setUppercase(Boolean uppercase) {
        isUppercase = uppercase;
    }

    @Override
    public void sendNotificationy(Customer customer, String message) {
        if (this.isUppercase) {
            message = message.toUpperCase();
        }

        System.out.printf("Enviando notificação para %s via email para o host %s:  %s%n", customer.getName(), smtpServerHost, message);
    }
}
