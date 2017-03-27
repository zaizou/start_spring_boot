package dz.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by MEDJDOUB SEIFEDDINE on 15/03/2017.
 */
@SpringBootApplication
public class CourseApiApp extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CourseApiApp.class);
    }


    public static void main(String[] args){
        SpringApplication.run(CourseApiApp.class,args);

    }

}
