package com.basic.myspringboot.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

// 기본 생성자 및 Getter, Setter
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserReqFormDTO {
    private Long id;

    @NotEmpty(message = "Name은 필수 입력 항목입니다.")   // " " 허용
    private String name;

    @NotBlank(message = "Email은 필수 입력 항목입니다") // " " 허용x
    @Email(message = "Email 형식이 아닙니다")
    private String email;
}
