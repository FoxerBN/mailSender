package sk.foxer.emailSender.util;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import sk.foxer.emailSender.service.EmailService;

@Component
@RequiredArgsConstructor
public class ScheduledTask {
    private static final Logger log = LoggerFactory.getLogger(ScheduledTask.class);
    private final EmailService emailService;

    @Scheduled(cron = "0 0 5,12,18 * * *")
    public void sendScheduledEmail() {
        log.info("Sending scheduled email");
        try {
            emailService.sendQuoteToEmail("foxerdxd@gmail.com", "Richard");
        } catch (Exception e) {
            log.error("Failed to send scheduled email", e);
        }
    }
}
