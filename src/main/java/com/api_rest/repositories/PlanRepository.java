package com.api_rest.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.api_rest.models.PlanModel;

@Repository
public interface PlanRepository extends CrudRepository<PlanModel, Long> {
    // public abstract ArrayList<PlanModel> findById_usuario(Integer id_usuario);
}
