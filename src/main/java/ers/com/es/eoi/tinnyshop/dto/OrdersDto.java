package ers.com.es.eoi.tinnyshop.dto;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrdersDto{
	
	private int id;
	private String username;
	private Date orderDate;
	private List<OrderArticleDto> orderArticles;
	
}
