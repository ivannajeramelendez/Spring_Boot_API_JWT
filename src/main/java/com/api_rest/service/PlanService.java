package com.api_rest.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api_rest.models.PlanModel;
import com.api_rest.repositories.PlanRepository;

@Service
public class PlanService {
    @Autowired
    PlanRepository planRepository;

    public ArrayList<PlanModel> obtenerPlanes(){
        return (ArrayList<PlanModel>) planRepository.findAll();
    }

    public PlanModel guardarPlan(PlanModel plan){
        return planRepository.save(plan);
    }

    public Optional<PlanModel> obtenerPorId(Long id){
        return planRepository.findById(id);
    }

    public ArrayList<PlanModel> obtenerId_usuario(Integer id_usuario){
        return planRepository.findById_usuario(id_usuario);
    }

    public boolean eliminarPlan(Long id){
        try{
            planRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}