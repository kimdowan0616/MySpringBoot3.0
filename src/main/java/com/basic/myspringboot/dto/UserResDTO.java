package com.basic.myspringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

// 기본 생성자 및 Getter, Setter
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserResDTO {
    private Long id;
    private String name;
    private String email;
    private LocalDateTime createdAt;
}
