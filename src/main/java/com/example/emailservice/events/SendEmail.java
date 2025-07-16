package com.example.emailservice.events;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SendEmail {
    private String from;
    private String to;
    private String subject;
    private String body;
}
