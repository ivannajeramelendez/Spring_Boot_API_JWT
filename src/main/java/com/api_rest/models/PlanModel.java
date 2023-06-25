package com.api_rest.models;

import javax.persistence.*;
import static javax.persistence.FetchType.LAZY;

@Entity
@Table(name = "plan")
public class PlanModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private Integer id_usuario;
    private String tipo;
    private String costo;
    private Integer activo;
    private Integer descuento;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "plan", referencedColumnName="id")
    private UsuarioModel id_usuario_plan;
    
    public UsuarioModel getid_usuario_plan() {
        return id_usuario_plan;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setid_usuario(Integer id_usuario){
        this.id_usuario = id_usuario;
    }

    public Integer getid_usuario() {
        return id_usuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public Integer getActivo(){
        return activo;
    }

    public void setActivo(Integer activo){
        this.activo = activo;
    }

    public Integer getDescuento() {
        return descuento;
    }

    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }

}
