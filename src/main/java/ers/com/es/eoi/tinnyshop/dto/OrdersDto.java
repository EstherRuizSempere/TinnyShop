package ers.com.es.eoi.tinnyshop.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrdersDto {
	private int id;
	private String username;
	private LocalDate date;
	private List<OrderArticleDto> articles;
}
