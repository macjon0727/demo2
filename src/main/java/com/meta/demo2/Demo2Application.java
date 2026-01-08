package com.meta.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
		System.out.println("게시판을 여는 중입니다.");
		System.out.println("테스트를 위한 오류 코드.");
    }

}
