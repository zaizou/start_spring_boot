package dz.start;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * Created by MEDJDOUB SEIFEDDINE on 15/03/2017.
 */
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@EnableAdminServer
public class CourseApiApp {

    public static void main(String[] args){
        SpringApplication.run(CourseApiApp.class,args);

    }

}
