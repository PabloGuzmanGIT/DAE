package com.ep4.ep4;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@Controller
@RequestMapping("/visitas")
public class visitasController {

    @Autowired
    private final VisitasService visitasService;

    @GetMapping("")
    public String visitas(Model model) {
        model.addAttribute("visitantes", "Registro visitantes");
        model.addAttribute("titulo", "Registro de Visitas");
        model.addAttribute("visitlist",visitasService.mostrarvisitas());
//        model.addAttribute("searchById", visitasService.obtenerporId().getId());

//        model.addAttribute("getbyID",visitasService.obtenerporId());
        return "visitas";
    }



    @PostMapping("")
    public String registrar(@ModelAttribute("visitas")visitas visitas){
        visitasService.saving(visitas);

        return "redirect:/visitas";
    }

    public String Actualizar(@ModelAttribute("visitas")visitas visitas){
        visitasService.saving(visitas);
        return "redirect:/visitas";
    }

    @DeleteMapping("{id}")
    public String deleteVisitas(@PathVariable("id")int id){
        visitasService.eliminar(id);
        return "redirect:/visitas";
    }

}
