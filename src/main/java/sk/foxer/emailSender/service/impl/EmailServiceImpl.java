package sk.foxer.emailSender.service.impl;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import org.springframework.stereotype.Service;
import sk.foxer.emailSender.service.EmailService;

import java.io.IOException;

@Service
public class EmailServiceImpl implements EmailService {
    private final SendGrid sendGrid;

    public EmailServiceImpl(SendGrid sendGrid) {
        this.sendGrid = sendGrid;
    }

    @Override
    public void sendEmail(String to, String subject, String htmlContent) {
        Email from = new Email("barspin4499@gmail.com");
        Email toEmail = new Email(to);
        Content content = new Content("text/html", htmlContent);
        Mail mail = new Mail(from, subject, toEmail, content);

        Request request = new Request();
        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            sendGrid.api(request);
        } catch (IOException e) {
            throw new RuntimeException("Failed to send email", e);
        }
    }
}
