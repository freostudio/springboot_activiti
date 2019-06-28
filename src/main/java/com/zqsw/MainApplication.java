package com.zqsw;

import com.zqsw.service.MyActivitiService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

/**
 * 入口程序，主程序
 */
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        //启动Spring应用
        SpringApplication.run(MainApplication.class,args);
    }

//    @Bean
//    public CommandLineRunner init(final MyActivitiService myService) {
//
//        return new CommandLineRunner() {
//            public void run(String... strings) throws Exception {
//                myService.createPersons();
//            }
//        };
//
//    }
}
