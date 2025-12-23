package com.muradhasanli.blog.repository;

import com.muradhasanli.blog.domain.PostStatus;
import com.muradhasanli.blog.domain.entity.Category;
import com.muradhasanli.blog.domain.entity.Post;
import com.muradhasanli.blog.domain.entity.Tag;
import com.muradhasanli.blog.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {

    List<Post> findAllByStatusAndCategoryAndTagsContaining(PostStatus status, Category category, Tag tag);

    List<Post> findAllByStatusAndCategory(PostStatus status, Category category);

    List<Post> findAllByStatusAndTagsContaining(PostStatus status, Tag tag);

    List<Post> findAllByStatus(PostStatus status);

    List<Post> findByAuthorAndStatus(User author, PostStatus status);
}
