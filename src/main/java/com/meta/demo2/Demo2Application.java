package com.meta.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
        System.out.println("HiHi 충돌테스트 합니다");
        System.out.println("오늘 메뉴는 오삼불고기");
        System.out.println("내일 메뉴는 떡만둣국");
    }

}
