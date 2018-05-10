/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pcera;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Boti
 */
@Entity
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idUsuario;
    private String usuario;
    private String contraseña;
    private String nombre;
    private String apellidos;
    private String dni;
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    private Integer tipoUsuario;
    private String email;
    private String direccion;
    private String sexo;
    @Lob
    @Column(length = 10000)
    private byte[] fotoPerfil;
    @ManyToMany(mappedBy = "usuarioCollection")
    private List<Evento> eventoCollection;
    @OneToMany(mappedBy = "usuarioIdUsuario")
    private List<Documento> documentoCollection;
    @OneToMany(mappedBy = "usuarioIdUsuario")
    private List<Cuota> cuotaCollection;
    @OneToMany(mappedBy = "usuario")
    private List<Promesa> promesaCollection;

    public Usuario() {
    }

    public Usuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(Integer tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public byte[] getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(byte[] fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    @XmlTransient
    public List<Evento> getEventoCollection() {
        return eventoCollection;
    }

    public void setEventoCollection(List<Evento> eventoCollection) {
        this.eventoCollection = eventoCollection;
    }

    @XmlTransient
    public List<Documento> getDocumentoCollection() {
        return documentoCollection;
    }

    public void setDocumentoCollection(List<Documento> documentoCollection) {
        this.documentoCollection = documentoCollection;
    }

    @XmlTransient
    public List<Cuota> getCuotaCollection() {
        return cuotaCollection;
    }

    public void setCuotaCollection(List<Cuota> cuotaCollection) {
        this.cuotaCollection = cuotaCollection;
    }

    @XmlTransient
    public List<Promesa> getPromesaCollection() {
        return promesaCollection;
    }

    public void setPromesaCollection(List<Promesa> promesaCollection) {
        this.promesaCollection = promesaCollection;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", tipoUsuario=" + tipoUsuario + ", email=" + email + ", direccion=" + direccion + ", sexo=" + sexo + ", fotoPerfil=" + fotoPerfil + ", eventoCollection=" + eventoCollection + ", documentoCollection=" + documentoCollection + ", cuotaCollection=" + cuotaCollection + ", promesaCollection=" + promesaCollection + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.idUsuario);
        hash = 29 * hash + Objects.hashCode(this.usuario);
        hash = 29 * hash + Objects.hashCode(this.contraseña);
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + Objects.hashCode(this.apellidos);
        hash = 29 * hash + Objects.hashCode(this.dni);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.contraseña, other.contraseña)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        if (!Objects.equals(this.idUsuario, other.idUsuario)) {
            return false;
        }
        return true;
    }

}
