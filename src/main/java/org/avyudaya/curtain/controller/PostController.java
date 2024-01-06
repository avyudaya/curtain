package org.avyudaya.curtain.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.security.RolesAllowed;
import lombok.RequiredArgsConstructor;
import org.avyudaya.curtain.dto.PostEditReq;
import org.avyudaya.curtain.dto.PostView;
import org.avyudaya.curtain.model.Role;
import org.avyudaya.curtain.service.PostService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Post")
@RestController
@RequestMapping(path = "api/post")
@RolesAllowed({Role.USER, Role.ADMIN})
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping
    public PostView create(@RequestBody @Validated PostEditReq request) {
        return postService.create(request);
    }

    @PutMapping("{id}")
    public PostView update(@PathVariable String id, @RequestBody @Validated PostEditReq request) {
        return postService.update(id, request);
    }

    @DeleteMapping("{id}")
    public PostView delete(@PathVariable String id) {
        return postService.delete(id);
    }

    @GetMapping("{id}")
    public PostView get(@PathVariable String id) {
        return postService.get(id);
    }
}
