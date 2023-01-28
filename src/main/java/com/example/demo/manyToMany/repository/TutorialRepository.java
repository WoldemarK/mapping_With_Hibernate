package com.example.demo.manyToMany.repository;

import com.example.demo.manyToMany.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findTutorialsByTagsId(Long tagId);
    List<Tutorial> findByPublished(boolean published);

    List<com.example.demo.oneToMany.model.Tutorial> findByTitleContaining(String title);
}
}
