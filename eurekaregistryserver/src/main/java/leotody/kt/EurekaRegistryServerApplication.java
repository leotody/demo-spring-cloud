package leotody.kt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by leotody on 08/08/2017.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaRegistryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRegistryServerApplication.class, args);
    }
}
