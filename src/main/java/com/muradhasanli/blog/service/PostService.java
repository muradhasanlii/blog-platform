package com.muradhasanli.blog.service;

import com.muradhasanli.blog.domain.CreatePostRequest;
import com.muradhasanli.blog.domain.UpdatePostRequest;
import com.muradhasanli.blog.domain.entity.Post;
import com.muradhasanli.blog.domain.entity.User;

import java.util.List;
import java.util.UUID;

public interface PostService {

    Post getPost(UUID id);

    List<Post> getAllPosts(UUID categoryId, UUID tagId);

    List<Post> getDraftPosts(User user);

    Post createPost(User user, CreatePostRequest request);

    Post updatePost(UUID id, UpdatePostRequest request);

    void deletePost(UUID id);
}
