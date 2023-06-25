package com.api_rest.models;

import javax.persistence.*;
// import static javax.persistence.FetchType.LAZY;

@Entity
@Table(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nombre;
    private String email;
    private Integer prioridad;
    private Integer plan;

    // @ManyToOne(fetch = LAZY)
    // // @JsonIgnore
    // @JoinColumn(name = "id_usuario", referencedColumnName="id_usuario")
    // private PlanModel id_usuario;
    
    // public PlanModel getid_usuario() {
    //     return id_usuario;
    // }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPrioridad(Integer prioridad){
        this.prioridad = prioridad;
    }

    public Integer getPrioridad(){
        return prioridad;
    }

    public void setPlan(Integer plan){
        this.plan = plan;
    }

    public Integer getPlan(){
        return plan;
    }
}
