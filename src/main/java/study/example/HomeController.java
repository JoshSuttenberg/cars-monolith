package study.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    String message;

    public HomeController(@Value("${welcome.message}") String message) {
        this.message = message;
    }

    @GetMapping("/")
    public String index() {
        return message;
    }

}
