package ers.com.es.eoi.tinnyshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import ers.com.es.eoi.tinnyshop.entity.OrderArticle;


public interface OrderArticleRepository  extends JpaRepository<OrderArticle, Integer> {

}
