package br.com.matheusbespalec.springdi.config;

import br.com.matheusbespalec.springdi.notification.NotificationEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificationConfig {
    @Bean
    public NotificationEmail notificationEmail() {
        NotificationEmail notificationEmail = new NotificationEmail("smtp.test.com");
        notificationEmail.setUppercase(true);

        return notificationEmail;
    }
}
