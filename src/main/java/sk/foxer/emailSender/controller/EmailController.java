package sk.foxer.emailSender.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.foxer.emailSender.dto.EmailRequest;
import sk.foxer.emailSender.service.EmailService;
import sk.foxer.emailSender.util.TemplateProcessor;

import java.util.Map;

@RestController
@RequestMapping("/api/email")
@RequiredArgsConstructor
public class EmailController {
    private final EmailService emailService;
    private final TemplateProcessor templateProcessor;

    @PostMapping("/send")
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequest request) {
        Map<String, String> vars = Map.of("name", request.getName(),
                                          "link", request.getLink());
        String html = templateProcessor.processTemplate("emailTemplate", vars);
        emailService.sendEmail(request.getTo(), "Newsletter", html);
        return ResponseEntity.ok("Email sent successfully");
    }
}
