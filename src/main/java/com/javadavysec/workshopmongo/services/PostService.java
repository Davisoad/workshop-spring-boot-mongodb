package com.javadavysec.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javadavysec.workshopmongo.domain.Post;
import com.javadavysec.workshopmongo.repository.PostsRepository;
import com.javadavysec.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

    @Autowired
    private PostsRepository repo;

    public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

  public List<Post> findByTitle(String text) {
    return repo.serachTitle(text);
  }
}
