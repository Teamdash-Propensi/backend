package propensid03.teamdash.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String firstPage() {
        return "TeamDash Staging";
    }
}
