package com.agencypro02.agencypro02.repository;

import com.agencypro02.agencypro02.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}