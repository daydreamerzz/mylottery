package cn.itedus.lottery;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * @version 1.0
 * @auther wpl
 * @Data: 2024/4/25
 * @Time: 22:06
 * @Description:
 */

@SpringBootApplication
@Configuration
@EnableDubbo
public class LotteryApplication {
    public static void main(String[] args) {
        SpringApplication.run(LotteryApplication.class, args);
    }
}
