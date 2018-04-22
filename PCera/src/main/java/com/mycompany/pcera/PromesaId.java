package com.mycompany.pcera;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PromesaId implements Serializable {

    @Column(name = "PK_usuario_id")
    private Long Id_Usuario;
    @Column(name = "PK_seccion_id")
    private Long Id_Seccion;

    public Long getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(Long Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }

    public Long getId_Seccion() {
        return Id_Seccion;
    }

    public void setId_Seccion(Long Id_Seccion) {
        this.Id_Seccion = Id_Seccion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.Id_Usuario);
        hash = 97 * hash + Objects.hashCode(this.Id_Seccion);
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
        final PromesaId other = (PromesaId) obj;
        if (!Objects.equals(this.Id_Usuario, other.Id_Usuario)) {
            return false;
        }
        if (!Objects.equals(this.Id_Seccion, other.Id_Seccion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PromesaId{" + "Id_Usuario=" + Id_Usuario + ", Id_Seccion=" + Id_Seccion + '}';
    }

}
