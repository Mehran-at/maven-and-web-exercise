package at.nacs.web.basic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delicious")
public class DeliciousEndpoint {
    @GetMapping
    String delicious () {
        return"It's delicious.";
    }

    @GetMapping("/somebody")
    String sombodyIsDelicious() {
        return "Somebody is delicious.";
    }

    @GetMapping("/{name}")
    String sombodyIsDelicious(@PathVariable String name) {
        return name + " is delicious.";
    }
}
