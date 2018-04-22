package com.mycompany.pcera;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Promesa implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PromesaPK promesaPK;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    //En esta etiqueta son neesarios todos esos atributos para que funcione
    @JoinColumn(name = "SECCION_ID_SECCION", referencedColumnName = "ID_SECCION", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Seccion seccion;
    //En esta etiqueta son neesarios todos esos atributos para que funcione
    @JoinColumn(name = "USUARIO_ID_USUARIO", referencedColumnName = "ID_USUARIO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;

    public Promesa() {
    }

    public Promesa(PromesaPK promesaPK) {
        this.promesaPK = promesaPK;
    }

    public Promesa(int usuarioIdUsuario, int seccionIdSeccion) {
        this.promesaPK = new PromesaPK(usuarioIdUsuario, seccionIdSeccion);
    }

    public PromesaPK getPromesaPK() {
        return promesaPK;
    }

    public void setPromesaPK(PromesaPK promesaPK) {
        this.promesaPK = promesaPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (promesaPK != null ? promesaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Promesa)) {
            return false;
        }
        Promesa other = (Promesa) object;
        if ((this.promesaPK == null && other.promesaPK != null) || (this.promesaPK != null && !this.promesaPK.equals(other.promesaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkg0entrega1.Promesa[ promesaPK=" + promesaPK + " ]";
    }

}
