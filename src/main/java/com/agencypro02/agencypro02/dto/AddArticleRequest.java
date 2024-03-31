package com.agencypro02.agencypro02.dto;

import com.agencypro02.agencypro02.domain.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddArticleRequest {
    private String title;
    private String content;
    public Article toEntity() {
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }
}