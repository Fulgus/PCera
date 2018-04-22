/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pcera;

import javax.persistence.Embeddable;
import java.util.Objects;
import javax.persistence.Column;

/**
 *
 * @author JoseMaria
 */
@Embeddable
public class InscripcionId {
    @Column(name = "Usuario_ID_Usuario")
    private Long id_Usuario;
    @Column(name = "Evento_ID_Evento")
    private Long id_Evento;

    public InscripcionId() {
        
    }
    
    
    public InscripcionId(Long id_Usuario, Long id_Evento) {
        this.id_Usuario = id_Usuario;
        this.id_Evento = id_Evento;
    }

    public Long getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(Long id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public Long getId_Evento() {
        return id_Evento;
    }

    public void setId_Evento(Long id_Evento) {
        this.id_Evento = id_Evento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id_Usuario);
        hash = 79 * hash + Objects.hashCode(this.id_Evento);
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
        final InscripcionId other = (InscripcionId) obj;
        if (!Objects.equals(this.id_Usuario, other.id_Usuario)) {
            return false;
        }
        if (!Objects.equals(this.id_Evento, other.id_Evento)) {
            return false;
        }
        return true;
    }
    
    
    
}
