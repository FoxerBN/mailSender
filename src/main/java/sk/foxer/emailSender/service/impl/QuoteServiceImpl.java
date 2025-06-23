package sk.foxer.emailSender.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import sk.foxer.emailSender.dto.QuoteDto;
import sk.foxer.emailSender.service.QuoteService;

@Service
@RequiredArgsConstructor
public class QuoteServiceImpl implements QuoteService {
    private final RestTemplate restTemplate;

    @Override
    public QuoteDto getRandomQuote() {
        String url = "https://zenquotes.io/api/random";
        QuoteDto[] response  = restTemplate.getForObject(url, QuoteDto[].class);

        if (response == null || response.length == 0) {
            throw new RuntimeException("Failed to fetch quote");
        }
        return response[0];
    }
}
