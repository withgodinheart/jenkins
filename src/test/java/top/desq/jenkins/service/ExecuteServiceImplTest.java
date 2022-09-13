package top.desq.jenkins.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ExecuteServiceImplTest {

    private final ExecuteService executeService = new ExecuteServiceImpl();

    @Test
    void run() {
        assertDoesNotThrow(executeService::run);
    }
}