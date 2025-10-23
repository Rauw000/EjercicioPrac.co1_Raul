package EjercicioPrac.co1_Raul.demo.controller;

import EjercicioPrac.co1_Raul.demo.domain.Categoria;
import EjercicioPrac.co1_Raul.demo.service.LibroService;
import EjercicioPrac.co1_Raul.demo.service.CategoriaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {

    private final CategoriaService categoriaService;
    private final LibroService libroService;

    public CategoriaController(CategoriaService categoriaService, LibroService libroService) {
        this.categoriaService = categoriaService;
        this.libroService = libroService;
    }
    
    // Mostrar listado y formulario
    @GetMapping
    public String mostrarIndex(Model model) {
        model.addAttribute("categorias", categoriaService.listarTodos());
        model.addAttribute("categoria", new Categoria()); // objeto vacío para agregar
        model.addAttribute("libros", libroService.listarTodos());
        return "index";  // aquí va tu página principal con fragmentos
    }

    // Guardar categoria (nuevo o modificado)
    @PostMapping("/guardar")
    public String guardarCategoria(@ModelAttribute("categoria") Categoria categoria) {
        categoriaService.guardar(categoria);
        return "redirect:/categorias";
    }

    // Modificar categoria: mostrar el categoria en el formulario
    @GetMapping("/modificar/{id}")
    public String modificarCategoria(@PathVariable Long id, Model model) {
        Categoria categoria = categoriaService.obtenerPorId(id).orElse(new Categoria());
        model.addAttribute("categoria", categoria);
        model.addAttribute("categorias", categoriaService.listarTodos());
        model.addAttribute("libros", libroService.listarTodos());
        return "index";
    }

    // Eliminar categoria
    @PostMapping("/eliminar")
    public String eliminarCategoria(@RequestParam("id") Long id) {
        categoriaService.eliminar(id);
        return "redirect:/categorias";
    }
}