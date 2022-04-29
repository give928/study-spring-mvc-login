package com.give928.spring.mvc.login.domain.member;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@Builder
public class Member {
    private Long id;

    @NotBlank
    private String loginId; //로그인 ID

    @NotBlank
    private String name; //사용자 이름

    @NotBlank
    private String password;

}
