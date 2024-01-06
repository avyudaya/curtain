package org.avyudaya.curtain.service;

import lombok.RequiredArgsConstructor;
import org.avyudaya.curtain.dto.PostEditReq;
import org.avyudaya.curtain.dto.PostView;
import org.avyudaya.curtain.exception.NotFoundException;
import org.avyudaya.curtain.mapper.PostMapper;
import org.avyudaya.curtain.repository.PostRepository;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    private final PostMapper postMapper;
    public PostView create(PostEditReq request) {
        var post = postMapper.from(request);
        return postMapper.toPostView(postRepository.save(post));
    }

    public PostView update(String id, PostEditReq request) {
        var post = postMapper.from(request);
        post.setId(id);
        var dbPost = postRepository.findById(id);

        if(dbPost.isEmpty()){
            throw new NotFoundException("Can't find post for given id.");
        }

        return postMapper.toPostView(postRepository.save(post));
    }

    public PostView delete(String id) {
        var dbPost = postRepository.findById(id);

        if(dbPost.isEmpty()){
            throw new NotFoundException("Can't find post for given id.");
        }

        postRepository.deleteById(id);
        return postMapper.toPostView(dbPost.get());
    }

    public PostView get(String id) {
        var dbPost = postRepository.findById(id);
        if(dbPost.isEmpty()){
            throw new NotFoundException("Can't find post for given id.");
        }
        return postMapper.toPostView(dbPost.get());
    }
}
