package com.give928.spring.mvc.login.web.login.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class LoginForm {
    @NotBlank
    private String loginId;

    @NotBlank
    private String password;
}
