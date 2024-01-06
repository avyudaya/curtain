package org.avyudaya.curtain.model;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("posts")
@Getter
@Setter
@RequiredArgsConstructor
public class Post {
    @Id
    private String id;
    private String title;
    private String description;
}
