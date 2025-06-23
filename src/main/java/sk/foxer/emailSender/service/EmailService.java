package sk.foxer.emailSender.service;

public interface EmailService {
    void sendEmail(String to, String subject, String htmlContent);
    void sendQuoteToEmail(String to, String name);
}
