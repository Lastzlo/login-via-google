package ua.kiev.prog.oauth2.loginviagoogle.repos;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import ua.kiev.prog.oauth2.loginviagoogle.model.Account;
import ua.kiev.prog.oauth2.loginviagoogle.model.Product;
import ua.kiev.prog.oauth2.loginviagoogle.model.Task;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByBrendId (String brendId, Pageable pageable);

    /*List<Product> getAll(Pageable pageable);*/

}
