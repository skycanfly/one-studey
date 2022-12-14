package demoneo4j2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories("com.example.demoneo4j2.repository")
public class DemoNeo4j2Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoNeo4j2Application.class, args);
    }

}
