package comn2s.eurekhaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekhaserverApplication {

    // Hello entry point

    public static void main(String[] args) {
        SpringApplication.run(EurekhaserverApplication.class, args);
    }

}
