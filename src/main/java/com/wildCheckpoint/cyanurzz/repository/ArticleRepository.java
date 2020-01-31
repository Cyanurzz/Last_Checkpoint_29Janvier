package com.wildCheckpoint.cyanurzz.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildCheckpoint.cyanurzz.entity.Article;





@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
