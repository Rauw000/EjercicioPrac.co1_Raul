package EjercicioPrac.co1_Raul.demo.controller;

import EjercicioPrac.co1_Raul.demo.domain.Libro;
import EjercicioPrac.co1_Raul.demo.domain.Categoria;
import EjercicioPrac.co1_Raul.demo.service.LibroService;
import EjercicioPrac.co1_Raul.demo.service.CategoriaService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/libros")
public class LibroController {

    private final LibroService libroService;
    private final CategoriaService categoriaService;

    public LibroController(LibroService libroService, CategoriaService categoriaService) {
        this.libroService = libroService;
        this.categoriaService = categoriaService;
    }

    // Mostrar listado y formulario
    @GetMapping
    public String mostrarIndex(Model model) {
        model.addAttribute("libros", libroService.listarTodos());
        model.addAttribute("libro", new Libro()); // objeto vacío para agregar
        model.addAttribute("categorias", categoriaService.listarTodos());
        return "index";  // aquí va tu página principal con fragmentos
    }

    // Guardar libro (nuevo o modificado)
    @PostMapping("/guardar")
    public String guardarLibro(@ModelAttribute("libro") Libro libro) {
        libroService.guardar(libro);
        return "redirect:/libros";
    }

    // Modificar libro: mostrar el libro en el formulario
    @GetMapping("/modificar/{id}")
    public String modificarLibro(@PathVariable Long id, Model model) {
        Libro libro = libroService.obtenerPorId(id).orElse(new Libro());
        model.addAttribute("libro", libro);
        model.addAttribute("libros", libroService.listarTodos());
        model.addAttribute("categorias", categoriaService.listarTodos());
        return "index";
    }

    // Eliminar libro
    @PostMapping("/eliminar")
    public String eliminarLibro(@RequestParam("id") Long id) {
        libroService.eliminar(id);
        return "redirect:/libros";
    }
}