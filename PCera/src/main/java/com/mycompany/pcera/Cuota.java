/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pcera;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Cuota id_Cuota;
    private Usuario id_Usuario;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    private Double Importe;
    private Integer Estado;

    public Cuota getId_Cuota() {
        return id_Cuota;
    }

    public void setId_Cuota(Cuota id_Cuota) {
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

    public Integer getEstado() {
        return Estado;
    }

    public void setEstado(Integer Estado) {
        this.Estado = Estado;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_Cuota != null ? id_Cuota.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuota)) {
            return false;
        }
        Cuota other = (Cuota) object;
        if ((this.id_Cuota == null && other.id_Cuota != null) || (this.id_Cuota != null && !this.id_Cuota.equals(other.id_Cuota))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.pcera.Cuota[ id=" + id_Cuota + " ]";
    }
    
}
