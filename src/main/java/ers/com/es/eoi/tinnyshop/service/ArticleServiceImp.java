package ers.com.es.eoi.tinnyshop.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ers.com.es.eoi.tinnyshop.dto.ArticleDto;
import ers.com.es.eoi.tinnyshop.entity.Article;
import ers.com.es.eoi.tinnyshop.repository.ArticleRepository;

@Service
public class ArticleServiceImp implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public List<ArticleDto> findByPartialName(String partialName) {
        List<Article> articles = articleRepository.findByNameContainingIgnoreCase(partialName);
        List<ArticleDto> filteredArticles = new ArrayList<>();
        for (Article article : articles) {
            filteredArticles.add(entityToDto(article));
        }
        return filteredArticles;
    }

    @Override
    public ArticleDto findById(int id) {
		return entityToDto(articleRepository.findById(id).get());

        
    }

    @Override
    public ArticleDto createArticle(ArticleDto articleDto) {
        Article entity = dtoToEntity(articleDto);
        Article savedArticle = articleRepository.save(entity);

        return entityToDto(savedArticle);
    }

    @Override
    public ArticleDto updateArticle(int id, ArticleDto articleDto) {
        if (articleRepository.existsById(id)) {
            Article entity = dtoToEntity(articleDto);
            entity.setId(id);
            Article updateArticle = articleRepository.save(entity);
            return entityToDto(updateArticle);
        } else {
            return null;
        }
    }

    private ArticleDto entityToDto(Article entity) {
        return new ArticleDto(entity.getId(), entity.getName(), entity.getPrice(), entity.getStock());
    }

    private Article dtoToEntity(ArticleDto articleDto) {
        return new Article(articleDto.getId(), articleDto.getName(), articleDto.getPrice(), articleDto.getStock());
    }
}

