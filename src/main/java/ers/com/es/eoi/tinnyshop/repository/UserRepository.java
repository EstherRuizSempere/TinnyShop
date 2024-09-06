package ers.com.es.eoi.tinnyshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import ers.com.es.eoi.tinnyshop.entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsernameAndPassword(String username, String password);
    User findByUsername(String username);

}
