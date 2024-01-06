package org.avyudaya.curtain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class PostView {
    private String id;
    private String title;
    private String description;
}
