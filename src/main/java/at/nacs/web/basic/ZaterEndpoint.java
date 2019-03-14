package at.nacs.web.basic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zater")
public class ZaterEndpoint {
    @GetMapping
    public String getMessage() {
        return "zater is delicious";
    }
}
