package org.avyudaya.curtain.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class AuthReq {
    @NotEmpty
    @Email
    private String email;
    @NotEmpty
    private String password;
}
