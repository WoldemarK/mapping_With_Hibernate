package com.example.demo.oneToMany.repository;

import com.example.demo.oneToMany.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByTutorialId(Long postId);
    @Transactional void deleteByTutorialId(Long tutorialId);
}
