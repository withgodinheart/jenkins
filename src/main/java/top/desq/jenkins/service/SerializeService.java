package top.desq.jenkins.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import top.desq.jenkins.model.Person;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeService {

    private final ObjectMapper om = new ObjectMapper();

    @SneakyThrows
    public void serialize(Object person) {
        try (var fs = new FileOutputStream("log.txt", false);
             var oos = new ObjectOutputStream(fs)) {
            oos.writeObject(person);
        }
    }

    @SneakyThrows
    public <T> T read(Class<T> type) {
        try (var fs = new FileInputStream("log.txt");
             var oos = new ObjectInputStream(fs)) {
            var object = type.cast(oos.readObject());
            System.out.println(object);
            return object;
        }
    }

    @SneakyThrows
    public void toJson(Person person) {
        var s = om.writeValueAsString(person);
        serialize(s);
    }

    @SneakyThrows
    public <T> T fromJson(Class<T> type) {
        var string = read(String.class);
        var object = om.readValue(string, type);
        System.out.println(object);
        return object;
    }
}
