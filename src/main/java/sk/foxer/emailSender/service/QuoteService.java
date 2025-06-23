package sk.foxer.emailSender.service;

import sk.foxer.emailSender.dto.QuoteDto;

public interface QuoteService {
    QuoteDto getRandomQuote();
}