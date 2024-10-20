package ers.com.es.eoi.tinnyshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ers.com.es.eoi.tinnyshop.dto.ArticleDto;
import ers.com.es.eoi.tinnyshop.service.ArticleService;

@RestController
@RequestMapping("/tinnyshop/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    // Get article by partial name
    @GetMapping("/articles/{partialName}/name")
    public ResponseEntity<List<ArticleDto>> getArticleByPartialName(@PathVariable String partialName) {
        List<ArticleDto> articles = articleService.findByPartialName(partialName);
        return new ResponseEntity<>(articles, HttpStatus.OK);
    }

    // Get article by id
    @GetMapping("/{id}")
    public ResponseEntity<ArticleDto> getArticleById(@PathVariable int id) {
        ArticleDto article = articleService.findById(id);
        if (article != null) {
            return new ResponseEntity<>(article, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Post new article
    @PostMapping
    public ResponseEntity<ArticleDto> createArticle(@RequestBody ArticleDto articleDto) {
        ArticleDto newArticle = articleService.createArticle(articleDto);
        return new ResponseEntity<>(newArticle, HttpStatus.CREATED);
    }

    // Put update article
    @PutMapping("/{id}")
    public ResponseEntity<ArticleDto> updateArticle(@PathVariable int id, @RequestBody ArticleDto articleDto) {
        ArticleDto updateArticle = articleService.updateArticle(id, articleDto);
        if (updateArticle != null) {
            return new ResponseEntity<>(updateArticle, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

