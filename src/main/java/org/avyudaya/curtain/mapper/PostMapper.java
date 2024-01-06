package org.avyudaya.curtain.mapper;

import org.avyudaya.curtain.dto.PostEditReq;
import org.avyudaya.curtain.dto.PostView;
import org.avyudaya.curtain.model.Post;
import org.avyudaya.curtain.utils.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class PostMapper {
    public Post from(PostEditReq postEditReq){
        var post = new Post();
        post.setTitle(StringUtils.getNotNullString(postEditReq.getTitle()));
        post.setDescription(StringUtils.getNotNullString(postEditReq.getDescription()));
        return post;
    }

    public PostView toPostView(Post post){
        var postView = new PostView();
        postView.setId(StringUtils.getNotNullString(post.getId()));
        postView.setTitle(StringUtils.getNotNullString(post.getTitle()));
        postView.setDescription(StringUtils.getNotNullString(post.getDescription()));
        return postView;
    }
}
