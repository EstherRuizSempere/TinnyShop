package ers.com.es.eoi.tinnyshop.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ers.com.es.eoi.tinnyshop.dto.OrderArticleDto;
import ers.com.es.eoi.tinnyshop.dto.OrdersDto;
import ers.com.es.eoi.tinnyshop.entity.Article;
import ers.com.es.eoi.tinnyshop.entity.OrderArticle;
import ers.com.es.eoi.tinnyshop.entity.Orders;
import ers.com.es.eoi.tinnyshop.repository.ArticleRepository;
import ers.com.es.eoi.tinnyshop.repository.OrderArticleRepository;
import ers.com.es.eoi.tinnyshop.repository.OrdersRepository;
import java.util.Optional;
import java.util.NoSuchElementException;



@Service
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	private OrdersRepository ordersRepository;

	@Autowired
	private OrderArticleRepository orderArticleRepository;
	
	@Autowired
	private ArticleRepository articleRepository;

	@Override
	public OrdersDto findById(int id) {
	    return null;
	}




	@Override
	public List<OrdersDto> findByUserUsernameContainingIgnoreCase(String partialName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrdersDto createOrder(OrdersDto ordersDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrdersDto updateOrder(int id, OrdersDto ordersDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteOrder(int id) {
		// TODO Auto-generated method stub

	}

	
}