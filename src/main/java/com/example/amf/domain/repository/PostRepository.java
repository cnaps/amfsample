package com.example.amf.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.amf.domain.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post,Long>{
    
}
