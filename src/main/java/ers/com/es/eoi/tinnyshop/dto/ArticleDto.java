package ers.com.es.eoi.tinnyshop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ArticleDto {

	private int id;
	private String name;
	private double price;
	private int stock;
}
