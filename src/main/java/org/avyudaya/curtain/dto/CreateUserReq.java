package org.avyudaya.curtain.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class CreateUserReq {
    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String fullName;
    @NotBlank
    private String password;

    @NotBlank
    private String rePassword;
}
