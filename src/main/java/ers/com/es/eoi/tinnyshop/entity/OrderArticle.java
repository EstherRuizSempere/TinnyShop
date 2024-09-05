package ers.com.es.eoi.tinnyshop.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_article")
public class OrderArticle {

	@Id
	private int id;
	
    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
	private Order order;
	

	@ManyToOne
	@MapsId("articleId")
	@JoinColumn(name = "article_id")
	private Article article;
	
	@Column
	private int quantity;
	
}
