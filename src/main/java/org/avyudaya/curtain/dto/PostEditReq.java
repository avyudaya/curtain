package org.avyudaya.curtain.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostEditReq {
    @NotBlank
    private String title;
    @NotBlank
    private String description;
}
