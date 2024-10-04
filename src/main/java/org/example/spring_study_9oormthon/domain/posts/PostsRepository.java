package org.example.spring_study_9oormthon.domain.posts;

import org.example.spring_study_9oormthon.domain.posts.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
