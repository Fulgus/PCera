package com.mycompany.pcera;

import java.util.Date;

@Entity

public class Promesa extends Usuario {

    @EmbeddedId
    private Usuario user_id; //Incluyo los atributos que hacen parte de la clave primaria

    private Seccion seccion_id;
/*
Con la relacion muchos a uno la tabla promesa no contiene
una columna usuario, pero con el @JoinColumn se define el
nombre de la clave foranea, que sera usada para obtener el
id del usuario.
*/

    @ManyToOne
    @JoinColumn (name = "Promesa_Usuario_FK")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "Promesa_Seccion_FK")
    private Seccion seccionid;

    public Usuario getUser_id() {
        return user_id;
    }

    public void setUser_id(Usuario user_id) {
        this.user_id = user_id;
    }

    public Seccion getSeccion_id() {
        return seccion_id;
    }

    public void setSeccion_id(Seccion seccion_id) {
        this.seccion_id = seccion_id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Temporal(TemporalType.DATE)


    private Date fecha;


    public Promesa(Usuario user_id, Seccion seccion_id, Usuario usuario, Date fecha) {
        this.user_id = user_id;
        this.seccion_id = seccion_id;
        this.usuario = usuario;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Promesa{" +
                "user_id=" + user_id +
                ", seccion_id=" + seccion_id +
                ", usuario=" + usuario +
                ", seccionid=" + seccionid +
                ", fecha=" + fecha +
                '}';
    }
}
