package top.desq.jenkins.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.Controller;

@Configuration
@ComponentScan(basePackages = "top.desq.jenkins", excludeFilters =
        {@ComponentScan.Filter(Controller.class), @ComponentScan.Filter(EnableWebMvc.class)})
public class RootConfig {
}
