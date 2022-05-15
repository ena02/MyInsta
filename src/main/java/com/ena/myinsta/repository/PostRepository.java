package com.ena.myinsta.repository;

import com.ena.myinsta.entity.Post;
import com.ena.myinsta.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAllByUserOrderByCreatedDate(User user);

    List<Post> findAllByOrderByCreatedDate();

    Optional<Post> findPostByIdAAndUser(Long id, User user);
}
