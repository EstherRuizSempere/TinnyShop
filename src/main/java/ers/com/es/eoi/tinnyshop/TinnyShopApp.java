package ers.com.es.eoi.tinnyshop;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class TinnyShopApp {

	public static void main(String[] args) {
		SpringApplication.run(TinnyShopApp.class, args);
	}	

}
