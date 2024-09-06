package ers.com.es.eoi.tinnyshop.service;

import java.util.List;

import ers.com.es.eoi.tinnyshop.dto.ArticleDto;

public interface ArticleService {

    List<ArticleDto> findByPartialName(String partialName);
    ArticleDto findById(int id);
    ArticleDto createArticle(ArticleDto articleDto);
    ArticleDto updateArticle(int id, ArticleDto articleDto);
}
