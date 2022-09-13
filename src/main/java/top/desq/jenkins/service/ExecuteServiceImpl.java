package top.desq.jenkins.service;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ExecuteServiceImpl implements ExecuteService {

    @Override
    public void run() {
        log.info("Running execute service...");
        System.out.println("Running execute service...");
    }
}
