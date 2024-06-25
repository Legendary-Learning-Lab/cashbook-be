package study.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {
    @GetMapping("/")
    fun home(): String {
        return "Hello! CI/CD Success!"
    }
}
