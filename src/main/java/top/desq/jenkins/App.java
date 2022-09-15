package top.desq.jenkins;

import lombok.SneakyThrows;
import top.desq.jenkins.model.Person;
import top.desq.jenkins.service.ExecuteServiceImpl;
import top.desq.jenkins.service.SerializeService;

public class App {

    @SneakyThrows
    public static void main(String[] args) {
        new ExecuteServiceImpl().run();

        new SerializeService().serialize(new Person(1L, "Alex", 20));
        new SerializeService().read(Person.class);

        new SerializeService().toJson(new Person(2L, "Zhenya", 22));
        new SerializeService().fromJson(Person.class);
    }
}
