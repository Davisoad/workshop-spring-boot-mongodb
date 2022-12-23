package com.javadavysec.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.javadavysec.workshopmongo.domain.Post;

@Repository
public interface PostsRepository extends MongoRepository<Post, String> {
    
    @Query("{ 'title': { $regex: ?0, $options: 'i' } }")
    List<Post> serachTitle(String text);

    List<Post> findByTitleContainingIgnoreCase(String text);
}
