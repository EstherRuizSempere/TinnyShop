package ers.com.es.eoi.tinnyshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ers.com.es.eoi.tinnyshop.entity.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
    List<Article> findByNameContainingIgnoreCase(String partialName);
}
