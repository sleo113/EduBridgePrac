package com.ll.edubridge.domain.post.post.dto;

import com.ll.edubridge.domain.post.post.entity.Post;
import lombok.Getter;
import org.springframework.lang.NonNull;

import java.time.LocalDateTime;

@Getter
public class PostDto {
    @NonNull
    private long id;
    @NonNull
    private LocalDateTime createDate;
    @NonNull
    private LocalDateTime modifyDate;
    @NonNull
    private long authorId;
    @NonNull
    private String authorName;
    @NonNull
    private String title;
    @NonNull
    private String body;

    public PostDto(Post post) {
        this.id = post.getId();
        this.createDate = post.getCreateDate();
        this.authorId = post.getWriter().getId();
        this.authorName = post.getWriter().getUsername();
        this.title = post.getTitle();
        this.body = post.getContent();
    }
}
