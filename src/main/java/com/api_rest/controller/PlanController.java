package com.api_rest.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.api_rest.models.PlanModel;
import com.api_rest.service.PlanService;

@RestController
@RequestMapping("/plan")
public class PlanController {
    @Autowired
    PlanService planService;

    @GetMapping()
    public ArrayList<PlanModel> obtenerPlanes(){
        System.out.println("Todos los planes");
        return planService.obtenerPlanes();
    }

    @PostMapping()
    public PlanModel guardarPlan(@RequestBody PlanModel plan){
        System.out.println("Guarde el plan: "+plan);
        return this.planService.guardarPlan(plan);
    }

    @GetMapping(path = "/{id}")
    public Optional<PlanModel> obtenerId_usuario(@PathVariable("id") long id){
        System.out.println("Consulta plan: "+id);
        return this.planService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<PlanModel> obtenerId_usuario(@RequestParam("id_usuario") Integer id_usuario){
        System.out.println("Consulta por id de usuario: "+id_usuario);
        return this.planService.obtenerId_usuario(id_usuario);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") long id){
        System.out.println("Eliminacion del plan: "+id);
        boolean ok = this.planService.eliminarPlan(id);
        if (ok){
            return "Se elimino el plan con id " + id;
        }else{
            return "No se pudo eliminar el plan con id " + id;
        }
    }
}
