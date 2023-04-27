package br.com.matheusbespalec.springdi.service;

import br.com.matheusbespalec.springdi.domain.Customer;
import br.com.matheusbespalec.springdi.notification.Notification;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {
    private Notification notification;

    public CustomerService(Notification notification) {
        this.notification = notification;
        System.out.println("Bean CustomerService");

        Customer fernando = new Customer("Fernando");
        this.notification.sendNotificationy(fernando, "enviando notificação...");
    }
}
