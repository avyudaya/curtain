package org.avyudaya.curtain.repository;

import org.avyudaya.curtain.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
