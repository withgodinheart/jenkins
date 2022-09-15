package top.desq.jenkins.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.desq.jenkins.service.ExecuteService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/app")
public class IndexController {

    private final ExecuteService executeService;

    @GetMapping()
    public String run() {
        executeService.run();
        return "success";
    }
}
