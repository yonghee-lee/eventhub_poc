package net.javis.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.javis.poc.service.UserService;
import net.javis.poc.user.User;

@RestController
public class KafkaController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    UserService userService;

    @GetMapping("/send")
    public String send(@RequestParam("message") String message) {
        kafkaTemplate.send("send-test", message);
        return "Message sent to the topic!";
    }

    @GetMapping("/save")
    public String save(@RequestParam("message") String message) {
        User user = new User("1000", message, "johndoe@example.com", 30);
        userService.saveUser(user);

        
        return "Message sent to the topic!";
    }

    @GetMapping("/user")
    public String user(@RequestParam("message") String message) {
        User retrievedUser = userService.getUserById("1000");
        return "Retrieved User: " + retrievedUser.getEmail();
    }
}

