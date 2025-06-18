package sk.foxer.emailSender.util;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

@Component
public class TemplateProcessor {
    public String processTemplate(String name, Map<String, String> variables){
        try {
            String template = new String(Files.readAllBytes(Paths.get("src/main/resources/templates/" + name + ".html")));
            for (Map.Entry<String, String> entry : variables.entrySet()){
                template = template.replace("{{" + entry.getKey() + "}}", entry.getValue());
            }
            return template;
        }catch (IOException e){
            throw new RuntimeException("Template not found", e);
        }
    }
}
