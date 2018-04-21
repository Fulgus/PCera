/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pcera;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author Marcos
 */
@Entity
public class Cuota implements Serializable {

    private static final long serialVersionUID = 1L;
    //TODO: implementar la clase CuotaId para añadir el id de dos atributos.
 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EmbeddedId
    private CuotaId id_Cuota;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    private Double Importe;
    private Long Estado;
    @OneToOne
    @JoinColumn (name = "Cuota_Usuario_FK")
    private Usuario id_Usuario;

    public CuotaId getId_Cuota() {
        return id_Cuota;
    }

    public void setId_Cuota(CuotaId id_Cuota) {
        this.id_Cuota = id_Cuota;
    }
    
    
    
    public Usuario getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(Usuario id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getImporte() {
        return Importe;
    }

    public void setImporte(Double Importe) {
        this.Importe = Importe;
    }

    public Long getEstado() {
        return Estado;
    }

    public void setEstado(Long Estado) {
        this.Estado = Estado;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_Cuota != null ? id_Cuota.hashCode() : 0);
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
        final Cuota other = (Cuota) obj;
        if (!Objects.equals(this.id_Cuota, other.id_Cuota)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.pcera.Cuota[ id=" + id_Cuota + " ]";
    }
    
}
