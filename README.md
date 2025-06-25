

```md
# 📧 Email Sender with Daily Quotes

This is a Spring Boot application that sends beautifully styled HTML emails with inspirational quotes fetched from an external API (zenquotes.io). You can send emails manually or on a **daily schedule** (7:00 and 19:00) using **SendGrid**.

---

## 🚀 Features

- ✅ Send emails with dynamic HTML templates (personalized greeting + quote)
- 📩 Uses **SendGrid API** for reliable delivery
- 🧘 Fetches quotes from [zenquotes.io](https://zenquotes.io/)
- 📅 Scheduled sending via Spring Scheduler (cron)
- 🔥 CORS configured for API access from frontend
- 🌿 Includes example HTML email template (`emailTemplate.html`)
- 👨‍💻 Fully written in Java with Spring Boot

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- SendGrid API
- RestTemplate
- Lombok
- ZenQuotes API
- HTML & CSS (email template)

---

## 📧 How It Works

### 🔹 Scheduled Email
Every day at 7:00 AM and 7:00 PM, the app sends a personalized email with a motivational quote using this HTML template.

### 🔹 Manual Email Send
Call the `EmailService.sendEmail()` or `sendQuoteToEmail()` methods to trigger emails manually from anywhere in your app.

---

## 🧪 Frontend Template (Optional)

This project also includes a custom HTML UI to test your API endpoints easily.  
Check `index.html` in the root folder for a **frontend API tester** with support for:

- Login/logout
- Get, create, update, delete students/users
- Displays responses in a styled UI

---

## 🧰 Setup

1. **Set your SendGrid API key** in `application.properties`:
   ```properties
   sendgrid.api.key=YOUR_SENDGRID_API_KEY
````

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

* ✏️ Edit the template in `src/main/resources/templates/emailTemplate.html`
* 🌐 Use a frontend to hit your Spring API and control email sends externally

---

### 🙌 Author

Built by [@foxerdxd](mailto:foxerdxd@gmail.com)

```
