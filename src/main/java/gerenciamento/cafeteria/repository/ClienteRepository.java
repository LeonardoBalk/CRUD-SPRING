package gerenciamento.cafeteria.repository;

import gerenciamento.cafeteria.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}