package cn.itedus.lottery.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * @version 1.0
 * @auther wpl
 * @Data: 2024/4/27
 * @Time: 19:04
 * @Description:
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@Configuration
public class ApiTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiTestApplication.class, args);
    }

}
