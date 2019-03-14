package at.nacs.web.secretmessage;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/secretmessage")
public class SecretMessageEndpoint {
    private SecretMessage secretMessage;
    @RequestMapping
    SecretMessage get() {
        return secretMessage;
    }

    @PutMapping
    SecretMessage replace(@RequestBody  SecretMessage newSecretMessage) {
        secretMessage = newSecretMessage;
        return secretMessage;
    }
}
