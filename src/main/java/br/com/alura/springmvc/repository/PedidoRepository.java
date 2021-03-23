package br.com.alura.springmvc.repository;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.alura.springmvc.model.Pedido;
import br.com.alura.springmvc.model.StatusPedido;


@Repository
public interface PedidoRepository extends JpaRepository<Pedido, String> {

	@Cacheable("pedido")
	List<Pedido> findByStatus(StatusPedido status, Pageable sort);

	@Query("select p from Pedido p join p.user u  where u.username = :username")
	List<Pedido> findAllbyUsuario(@Param("username") String username);

	@Query("select p from Pedido p join p.user u  where u.username = :username and p.status = :status")
	List<Pedido> findByStatusEUsuario(StatusPedido status, @Param("username") String username);
}
