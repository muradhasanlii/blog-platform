package com.muradhasanli.blog.mapper;

import com.muradhasanli.blog.domain.CreatePostRequest;
import com.muradhasanli.blog.domain.UpdatePostRequest;
import com.muradhasanli.blog.domain.dto.CreatePostRequestDto;
import com.muradhasanli.blog.domain.dto.PostDto;
import com.muradhasanli.blog.domain.dto.UpdatePostRequestDto;
import com.muradhasanli.blog.domain.entity.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PostMapper {
    @Mapping(target = "author", source = "author")
    @Mapping(target = "category", source = "category")
    @Mapping(target = "tags", source = "tags")
    @Mapping(target = "status", source = "status")
    PostDto toDto(Post post);

    CreatePostRequest toCreatePostRequest(CreatePostRequestDto dto);

    UpdatePostRequest toUpdatePostRequest(UpdatePostRequestDto dto);
}
