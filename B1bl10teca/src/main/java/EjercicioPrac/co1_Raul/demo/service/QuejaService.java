package EjercicioPrac.co1_Raul.demo.service;

import EjercicioPrac.co1_Raul.demo.domain.Queja;
import EjercicioPrac.co1_Raul.demo.repository.QuejaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuejaService {

    private final QuejaRepository quejaRepository;

    public QuejaService(QuejaRepository quejaRepository) {
        this.quejaRepository = quejaRepository;
    }

    public List<Queja> listarTodos() {
        return quejaRepository.findAll();
    }

    public Optional<Queja> obtenerPorId(Long id) {
        return quejaRepository.findById(id);
    }

    public Queja guardar(Queja queja) {
        return quejaRepository.save(queja);
    }

    public void eliminar(Long id) {
        quejaRepository.deleteById(id);
    }
}