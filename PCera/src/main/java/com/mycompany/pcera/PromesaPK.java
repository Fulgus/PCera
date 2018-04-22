package com.mycompany.pcera;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PromesaPK implements Serializable {

    @Column(name = "USUARIO_ID_USUARIO")
    private int usuarioIdUsuario;
    @Column(name = "SECCION_ID_SECCION")
    private int seccionIdSeccion;

    public PromesaPK() {
    }

    public PromesaPK(int usuarioIdUsuario, int seccionIdSeccion) {
        this.usuarioIdUsuario = usuarioIdUsuario;
        this.seccionIdSeccion = seccionIdSeccion;
    }

    public int getUsuarioIdUsuario() {
        return usuarioIdUsuario;
    }

    public void setUsuarioIdUsuario(int usuarioIdUsuario) {
        this.usuarioIdUsuario = usuarioIdUsuario;
    }

    public int getSeccionIdSeccion() {
        return seccionIdSeccion;
    }

    public void setSeccionIdSeccion(int seccionIdSeccion) {
        this.seccionIdSeccion = seccionIdSeccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) usuarioIdUsuario;
        hash += (int) seccionIdSeccion;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PromesaPK)) {
            return false;
        }
        PromesaPK other = (PromesaPK) object;
        if (this.usuarioIdUsuario != other.usuarioIdUsuario) {
            return false;
        }
        if (this.seccionIdSeccion != other.seccionIdSeccion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkg0entrega1.PromesaPK[ usuarioIdUsuario=" + usuarioIdUsuario + ", seccionIdSeccion=" + seccionIdSeccion + " ]";
    }

}
