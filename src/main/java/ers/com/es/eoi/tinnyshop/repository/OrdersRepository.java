package ers.com.es.eoi.tinnyshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ers.com.es.eoi.tinnyshop.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer>{
	Orders findById (int id);
	
	List<Orders>findByUserUsernameContainingIgnoreCase(String partialName);
}