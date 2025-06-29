# 📧 EmailSender – Java Spring Boot Email Service with Daily Quotes

EmailSender is a Spring Boot application that sends beautifully styled HTML emails with inspirational quotes fetched from [zenquotes.io](https://zenquotes.io/). It automates daily email delivery using SendGrid and also supports manual email sending.

---

## 🚀 Features

- Send emails with dynamic HTML templates (personalized greeting and quote)
- Uses **SendGrid API** for reliable email delivery
- Fetches quotes from [zenquotes.io](https://zenquotes.io/)
- Scheduled sending via Spring Scheduler (default: 7:00 and 19:00)
- Customizable HTML email template (`emailTemplate.html`)
- REST API for manual triggering
- Fully written in Java 17+ using Spring Boot

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- SendGrid API
- RestTemplate (for API calls)
- Lombok
- ZenQuotes API
- HTML & CSS (for email template)

---

## 📧 How It Works

### Scheduled Email

- Every day at 7:00 AM and 7:00 PM, the app sends a personalized email with a motivational quote using the HTML template.

### Manual Email Send

- Call `EmailService.sendEmail()` or `sendQuoteToEmail()` in your Java code, or use the REST endpoint `/api/email/send` to trigger emails manually.

---

## 🧰 Setup

1. **Set your SendGrid API key** in `application.properties`:
    ```properties
    sendgrid.api.key=YOUR_SENDGRID_API_KEY
    ```

2. (Optional) Modify scheduled recipient:
    ```java
    emailService.sendQuoteToEmail("your@email.com", "YourName");
    ```

3. Run the application:
    ```bash
    ./mvnw spring-boot:run
    ```

---

## 💡 Customization

- Edit the template in `src/main/resources/templates/emailTemplate.html`
- Use a frontend or tools like Postman to hit your Spring API and control email sends externally

---

## 📂 Project Structure

- `src/main/java/sk/foxer/emailSender/EmailSenderApplication.java`: Main entry point
- `controller/EmailController.java`: REST API for sending emails
- `service/impl/EmailServiceImpl.java`: Core email sending logic (integrates with SendGrid)
- `service/impl/QuoteServiceImpl.java`: Fetches random quotes from zenquotes.io
- `util/TemplateProcessor.java`: Processes HTML templates with variables
- `src/main/resources/templates/emailTemplate.html`: Editable HTML email template

---

## 🙌 Author

Built by [@FoxerBN](mailto:foxerdxd@gmail.com)
