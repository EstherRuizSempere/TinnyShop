package ers.com.es.eoi.tinnyshop.entity;

import java.util.List;


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
@Table(name = "article")
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String name;
	@Column
	private double price;
	@Column
	private int stock;
	
	@OneToMany(mappedBy = "article")
	private List<OrderArticle> OrderArticle;
}
