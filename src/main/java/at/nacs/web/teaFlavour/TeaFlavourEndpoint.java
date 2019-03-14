package at.nacs.web.teaFlavour;


import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/teaflavours")
public class TeaFlavourEndpoint {

    private Set<String> flavours = new HashSet<>();

    @GetMapping
    Set<String> get() {
        return flavours;
    }

    @GetMapping("/{flavour}")
    String getOne(@PathVariable String flavour) {
        if (flavours.contains(flavour)) {
            return "We have it.";
        }
        return "We don't have it.";
    }

    @PostMapping
    String add(@RequestBody String flavour) {
        flavours.add(flavour);
        return "Flavour added: " + flavour;
    }

    @DeleteMapping
    void delete() {
        flavours.clear();
    }

    @DeleteMapping("/{flavour}")
    void delete(@PathVariable String flavour) {
        flavours.remove(flavour);
    }

}