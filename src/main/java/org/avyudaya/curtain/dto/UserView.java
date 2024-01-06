package org.avyudaya.curtain.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class UserView {
    private String id;
    private String email;
    private String fullName;
}
