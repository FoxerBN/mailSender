package sk.foxer.emailSender.dto;

import lombok.Data;
//todo add validation
@Data
public class EmailRequest {
    private String to;
    private String name;
    private String link;
}
