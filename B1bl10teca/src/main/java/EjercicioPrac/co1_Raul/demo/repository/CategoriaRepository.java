package EjercicioPrac.co1_Raul.demo.repository;

import EjercicioPrac.co1_Raul.demo.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
