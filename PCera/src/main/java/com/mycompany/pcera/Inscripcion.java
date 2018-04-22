/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pcera;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Jose
 */
@Entity
public class Inscripcion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    private InscripcionId id_inscripcion;

    @ManyToOne
    @JoinColumn(name = "USUARIO_ID_USUARIO", referencedColumnName = "ID_USUARIO")    
    private Usuario id_Usuario;

    @ManyToOne
    @JoinColumn(name = "EVENTO_ID_EVENTO", referencedColumnName = "ID_EVENTO")
    private Evento id_Evento;

    public InscripcionId getId_inscripcion() {
        return id_inscripcion;
    }

    public void setId_inscripcion(InscripcionId id_inscripcion) {
        this.id_inscripcion = id_inscripcion;
    }

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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.id_inscripcion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inscripcion other = (Inscripcion) obj;
        if (!Objects.equals(this.id_inscripcion, other.id_inscripcion)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "Inscripcion{" + "id_inscripcion=" + id_inscripcion + ", id_Usuario=" + id_Usuario + ", id_Evento=" + id_Evento + '}';
    }

}
