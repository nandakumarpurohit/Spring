package com.demo.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

@Component
public class ExampleClient {

    @Autowired
    private MailSender mailSender;
    @Autowired
    private SimpleMailMessage mailMessage;

    public void sendMail(){
        System.out.println("sending mail");
        SimpleMailMessage msg = new SimpleMailMessage(mailMessage);//using copy constructor
        msg.setTo("<email>");
        msg.setSubject("test subject 2");
        msg.setText("spring email integration test 2");
        mailSender.send(msg);
        System.out.println("done");
    }
}