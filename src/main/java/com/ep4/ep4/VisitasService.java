package com.ep4.ep4;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class VisitasService {

    private final VisitasRepository visitasRepository;

    public List<visitas> mostrarvisitas() {
        return visitasRepository.findAll();

    }

    public visitas saving(visitas visitas) {
        return visitasRepository.save(visitas);
    }

    public boolean eliminar(Integer id) {
        Optional<visitas> optionalVisitas = visitasRepository.findById(id);
        if (optionalVisitas.isPresent()) {
            visitasRepository.delete(optionalVisitas.get());
        } else {
            throw new RuntimeException("No se encontro el alumno");
        }
        return false;
    }



}

