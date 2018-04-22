/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pcera;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Manolo
 */
@Entity

public class Documento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_documento;
    @Column(length = 100)
    private String nombre;
    @Temporal(TemporalType.DATE)
    private Date fecha_subida;
    private Integer estado_archivo;
    @Lob
    @Column(length = 10000)
    private byte[] archivo;

    @ManyToOne
    @JoinColumn(name = "Documento_Usuario_FK")
    private Usuario usuario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_subida() {
        return fecha_subida;
    }

    public void setFecha_subida(Date fecha_subida) {
        this.fecha_subida = fecha_subida;
    }

    public Integer getEstado_archivo() {
        return estado_archivo;
    }

    public void setEstado_archivo(Integer estado_archivo) {
        this.estado_archivo = estado_archivo;
    }

    public byte[] getArchivo() {
        return archivo;
    }

    public void setArchivo(byte[] archivo) {
        this.archivo = archivo;
    }

    public Integer getId() {
        return id_documento;
    }

    public void setId(Integer id) {
        this.id_documento = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_documento != null ? id_documento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Documento)) {
            return false;
        }
        Documento other = (Documento) object;
        if ((this.id_documento == null && other.id_documento != null) || (this.id_documento != null && !this.id_documento.equals(other.id_documento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.pcera.Documento[ id=" + id_documento + " ]";
    }

}
