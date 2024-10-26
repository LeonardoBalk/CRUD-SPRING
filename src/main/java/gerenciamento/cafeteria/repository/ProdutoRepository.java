package gerenciamento.cafeteria.repository;

import gerenciamento.cafeteria.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
