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
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;


	    @ManyToOne
	    @JoinColumn(name = "article_id", nullable = false)
	    private Article article;
	    
	    @ManyToOne
	    @JoinColumn(name = "order_id", nullable = false)
	    private Orders orders;

	    @Column(nullable = false)
	    private int quantity;
	    

}
