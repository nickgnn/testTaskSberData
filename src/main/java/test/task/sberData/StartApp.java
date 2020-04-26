package test.task.sberData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import test.task.sberData.initializer.DataInitializer;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class StartApp {
    public static void main(String[] args) {
        SpringApplication.run(StartApp.class, args);
    }


    @Autowired
    private DataInitializer dataInitializer;

    @PostConstruct
    public void initTestData() {
        dataInitializer.init();
    }
}
