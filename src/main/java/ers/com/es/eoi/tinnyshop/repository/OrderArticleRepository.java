package ers.com.es.eoi.tinnyshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ers.com.es.eoi.tinnyshop.entity.OrderArticle;

@Repository
public interface OrderArticleRepository  extends JpaRepository<OrderArticle, Integer> {

}
