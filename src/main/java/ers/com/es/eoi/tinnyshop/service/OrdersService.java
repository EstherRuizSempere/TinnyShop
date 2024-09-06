package ers.com.es.eoi.tinnyshop.service;

import java.util.List;

import ers.com.es.eoi.tinnyshop.dto.OrdersDto;

public interface OrdersService{
	OrdersDto findById(int id);
	List<OrdersDto> findByUserUsernameContainingIgnoreCase(String partialName);
	OrdersDto createOrder (OrdersDto ordersDto);
	OrdersDto updateOrder(int id, OrdersDto ordersDto);
	void deleteOrder (int id);
}