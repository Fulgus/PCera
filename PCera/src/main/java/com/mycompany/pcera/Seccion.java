package com.mycompany.pcera;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Juan Antonio
 */
@Entity
public class Seccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idSeccion;
    private String nombre;
    @OneToMany(mappedBy = "seccion")
    private List<Promesa> promesaCollection;
    @OneToMany(mappedBy = "seccion")
    private List<Evento> eventoCollection;

    public Seccion() {
    }

    public Seccion(Integer idSeccion) {
        this.idSeccion = idSeccion;
    }

    public Integer getIdSeccion() {
        return idSeccion;
    }

    public void setIdSeccion(Integer idSeccion) {
        this.idSeccion = idSeccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<Promesa> getPromesaCollection() {
        return promesaCollection;
    }

    public void setPromesaCollection(List<Promesa> promesaCollection) {
        this.promesaCollection = promesaCollection;
    }

    public List<Evento> getEventoCollection() {
        return eventoCollection;
    }

    public void setEventoCollection(List<Evento> eventoCollection) {
        this.eventoCollection = eventoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.idSeccion);
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.promesaCollection);
        hash = 53 * hash + Objects.hashCode(this.eventoCollection);
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
        final Seccion other = (Seccion) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.idSeccion, other.idSeccion)) {
            return false;
        }
        if (!Objects.equals(this.promesaCollection, other.promesaCollection)) {
            return false;
        }
        if (!Objects.equals(this.eventoCollection, other.eventoCollection)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Seccion{" + "idSeccion=" + idSeccion + ", nombre=" + nombre + ", promesaCollection=" + promesaCollection + ", eventoCollection=" + eventoCollection + '}';
    }

}
