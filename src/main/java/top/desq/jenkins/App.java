package top.desq.jenkins;

import top.desq.jenkins.service.ExecuteServiceImpl;

public class App {

    public static void main(String[] args) {
        new ExecuteServiceImpl().run();
    }
}
