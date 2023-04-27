package br.com.matheusbespalec.springdi.notification;

import br.com.matheusbespalec.springdi.domain.Customer;

public interface Notification {
    void sendNotificationy(Customer customer, String message);
}
