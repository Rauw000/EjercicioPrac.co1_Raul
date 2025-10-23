package EjercicioPrac.co1_Raul.demo.controller;

import EjercicioPrac.co1_Raul.demo.domain.Queja;
import EjercicioPrac.co1_Raul.demo.service.QuejaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/quejas")
public class QuejaController {

    private final QuejaService quejaService;

    public QuejaController(QuejaService quejaService) {
        this.quejaService = quejaService;
    }

    @GetMapping
    public String listarQuejas(Model model) {
        model.addAttribute("quejas", quejaService.listarTodos());
        model.addAttribute("queja", new Queja());
        return "quejas/index";  // Aquí iría tu template thymeleaf para quejas
    }

    @PostMapping("/guardar")
    public String guardarQueja(@ModelAttribute Queja queja) {
        quejaService.guardar(queja);
        return "redirect:/quejas";
    }

    @PostMapping("/eliminar")
    public String eliminarQueja(@RequestParam Long id) {
        quejaService.eliminar(id);
        return "redirect:/quejas";
    }
}