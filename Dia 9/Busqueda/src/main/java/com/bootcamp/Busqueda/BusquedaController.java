package com.bootcamp.Busqueda;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusquedaController {
    /*“Crea un programa que tenga un arreglo con nombres completos de personas.
    Además, debe permitir realizar una búsqueda por el nombre de la persona”*/
    @GetMapping("/buscarPersona/{busqueda}")
    public String encontrarPersona(@PathVariable String busqueda){
        int i=0;
        String nombreEcontrado="";
        String[] nombres={"Juan Pérez","Ana García","Carlos Rodríguez","Maria Hernández","Luis López", "Carmen González","Jose Martínez","Isabel Gómez","Antonio Ruiz","Laura Ramírez"};
        for (String persona:nombres){

            if (persona.toLowerCase().contains(busqueda)){
                nombreEcontrado = nombres[i];
            }
            i++;


        }return nombreEcontrado;

    }


}
