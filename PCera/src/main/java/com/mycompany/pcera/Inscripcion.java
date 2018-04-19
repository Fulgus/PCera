/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pcera;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Jose
 */
@Entity
public class Inscripcion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_inscripcion;
    private Usuario id_Usuario;
    private Evento id_Evento;

    public Usuario getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(Usuario id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public Evento getId_Evento() {
        return id_Evento;
    }

    public void setId_Evento(Evento id_Evento) {
        this.id_Evento = id_Evento;
    }

    public Long getId() {
        return id_inscripcion;
    }

    public void setId(Long id) {
        this.id_inscripcion = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_inscripcion != null ? id_inscripcion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inscripcion)) {
            return false;
        }
        Inscripcion other = (Inscripcion) object;
        if ((this.id_inscripcion == null && other.id_inscripcion != null) || (this.id_inscripcion != null && !this.id_inscripcion.equals(other.id_inscripcion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.pcera.Inscripcion[ id=" + id_inscripcion + " ]";
    }
    
}