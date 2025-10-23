package EjercicioPrac.co1_Raul.demo.controller;

import EjercicioPrac.co1_Raul.demo.domain.Queja;
import EjercicioPrac.co1_Raul.demo.service.QuejaService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quejas")
public class QuejaController {

    private final QuejaService quejaService;

    public QuejaController(QuejaService quejaService) {
        this.quejaService = quejaService;
    }

    @GetMapping
    public List<Queja> listarQuejas() {
        return quejaService.listarTodas();
    }

    @PostMapping
    public Queja crearQueja(@RequestBody Queja queja) {
        return quejaService.guardar(queja);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Queja> obtenerPorId(@PathVariable Long id) {
        return quejaService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
