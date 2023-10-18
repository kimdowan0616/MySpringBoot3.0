package com.basic.myspringboot.dto;

import lombok.*;

@NoArgsConstructor  // 기본 생성자
@AllArgsConstructor // 오버로딩된 생성자
@Getter
@Setter
@ToString
@Builder    // 새 객체 생성 시 매개변수가 많을 경우 유연성을 주기 위한 Builder Pattern
public class Customer {
    private String name;
    private int age;
}
