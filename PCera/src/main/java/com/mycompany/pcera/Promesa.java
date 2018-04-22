package com.mycompany.pcera;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Objects;

@Entity

public class Promesa implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    private PromesaId Id_Usuario; //Incluyo los atributos que hacen parte de la clave primaria

    private PromesaId Id_Seccion;
    /*
Con la relacion muchos a uno la tabla promesa no contiene
una columna usuario, pero con el @JoinColumn se define el
nombre de la clave foranea, que sera usada para obtener el
id del usuario.
     */

    @ManyToOne
    @JoinColumn(name = "Promesa_Usuario_FK")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "Promesa_Seccion_FK")
    private Seccion seccionid;

    public PromesaId getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(PromesaId Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }

    public PromesaId getId_Seccion() {
        return Id_Seccion;
    }

    public void setId_Seccion(PromesaId Id_Seccion) {
        this.Id_Seccion = Id_Seccion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Seccion getSeccionid() {
        return seccionid;
    }

    public void setSeccionid(Seccion seccionid) {
        this.seccionid = seccionid;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.Id_Usuario);
        hash = 23 * hash + Objects.hashCode(this.Id_Seccion);
        hash = 23 * hash + Objects.hashCode(this.usuario);
        hash = 23 * hash + Objects.hashCode(this.seccionid);
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
        final Promesa other = (Promesa) obj;
        if (!Objects.equals(this.Id_Usuario, other.Id_Usuario)) {
            return false;
        }
        if (!Objects.equals(this.Id_Seccion, other.Id_Seccion)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.seccionid, other.seccionid)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Promesa{" + "Id_Usuario=" + Id_Usuario + ", Id_Seccion=" + Id_Seccion + ", usuario=" + usuario + ", seccionid=" + seccionid + '}';
    }

}
