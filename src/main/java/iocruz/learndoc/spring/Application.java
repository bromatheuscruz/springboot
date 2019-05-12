package iocruz.learndoc.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Created by bromatheuscruz 12/05/19 - 01:04.
 */
@SpringBootApplication
public class Application {
    public static void main(String ...args) {
        String[] _args = {"--debug" };
        SpringApplication.run(Application.class, _args);
    }
}
