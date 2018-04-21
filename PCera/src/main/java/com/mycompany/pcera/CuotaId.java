/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pcera;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Marcos
 */
@Embeddable
public class CuotaId {
    @Column(name = "ID_Cuota")
    private Long id_Cuota;
    @Column(name = "Usuario_ID_Usuario")
    private Long id_Usuario;

    public Long getId_Cuota() {
        return id_Cuota;
    }

    public void setId_Cuota(Long id_Cuota) {
        this.id_Cuota = id_Cuota;
    }

    public Long getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(Long id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.id_Cuota);
        hash = 29 * hash + Objects.hashCode(this.id_Usuario);
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
        final CuotaId other = (CuotaId) obj;
        if (!Objects.equals(this.id_Cuota, other.id_Cuota)) {
            return false;
        }
        if (!Objects.equals(this.id_Usuario, other.id_Usuario)) {
            return false;
        }
        return true;
    }
    
}
