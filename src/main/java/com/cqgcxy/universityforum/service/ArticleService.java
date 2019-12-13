package com.cqgcxy.universityforum.service;

import com.cqgcxy.universityforum.domain.Article;
import com.cqgcxy.universityforum.resultmap.ViewArtAndUser;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ArticleService {
    List<Article>getAllArticle();
    Page<Article>findArticleNoCriteria(Integer page,Integer size);//无条件查询
    List<ViewArtAndUser>findAllByArtTypeId(Long typeId);
}