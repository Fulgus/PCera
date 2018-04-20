/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pcera;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Manolo
 */
@Entity
public class Documento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_documento;
    private List<Usuario> usuario_id;
    private String nombre;
    private Date fecha_subida;
    private int estado_archivo;
    private String archivo;

    public List<Usuario> getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(List<Usuario> usuario_id) {
        this.usuario_id = usuario_id;
    }

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

    public int getEstado_archivo() {
        return estado_archivo;
    }

    public void setEstado_archivo(int estado_archivo) {
        this.estado_archivo = estado_archivo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public Long getId() {
        return id_documento;
    }

    public void setId(Long id) {
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
