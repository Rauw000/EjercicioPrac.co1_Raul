package EjercicioPrac.co1_Raul.demo.repository;

import EjercicioPrac.co1_Raul.demo.domain.Queja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuejaRepository extends JpaRepository<Queja, Long> {
}
