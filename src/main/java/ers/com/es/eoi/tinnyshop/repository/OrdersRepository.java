package ers.com.es.eoi.tinnyshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import ers.com.es.eoi.tinnyshop.entity.Order;


public interface OrderRepository  extends JpaRepository<Order, Integer> {

}
