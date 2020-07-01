/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author Jota Wolf
 */
public class Usuario {
    private int id;
    private String password;
    private Date last_login;
    private String rut_usuario;
    private String primer_nombre;
    private String segundo_nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private String email;
    private String rol;
    private int is_active;
    private int is_administrador;
    private int servicio_grua_id_servicio_grua;

    public Usuario() {
    }

    public Usuario(int id, String password, Date last_login, String rut_usuario, String primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido, String email, String rol, int is_active, int is_administrador, int servicio_grua_id_servicio_grua) {
        this.id = id;
        this.password = password;
        this.last_login = last_login;
        this.rut_usuario = rut_usuario;
        this.primer_nombre = primer_nombre;
        this.segundo_nombre = segundo_nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.email = email;
        this.rol = rol;
        this.is_active = is_active;
        this.is_administrador = is_administrador;
        this.servicio_grua_id_servicio_grua = servicio_grua_id_servicio_grua;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLast_login() {
        return last_login;
    }

    public void setLast_login(Date last_login) {
        this.last_login = last_login;
    }

    public String getRut_usuario() {
        return rut_usuario;
    }

    public void setRut_usuario(String rut_usuario) {
        this.rut_usuario = rut_usuario;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getIs_active() {
        return is_active;
    }

    public void setIs_active(int is_active) {
        this.is_active = is_active;
    }

    public int getIs_administrador() {
        return is_administrador;
    }

    public void setIs_administrador(int is_administrador) {
        this.is_administrador = is_administrador;
    }

    public int getServicio_grua_id_servicio_grua() {
        return servicio_grua_id_servicio_grua;
    }

    public void setServicio_grua_id_servicio_grua(int servicio_grua_id_servicio_grua) {
        this.servicio_grua_id_servicio_grua = servicio_grua_id_servicio_grua;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", password=" + password + ", last_login=" + last_login + ", rut_usuario=" + rut_usuario + ", primer_nombre=" + primer_nombre + ", segundo_nombre=" + segundo_nombre + ", primer_apellido=" + primer_apellido + ", segundo_apellido=" + segundo_apellido + ", email=" + email + ", rol=" + rol + ", is_active=" + is_active + ", is_administrador=" + is_administrador + ", servicio_grua_id_servicio_grua=" + servicio_grua_id_servicio_grua + '}';
    }
    
    
    
    

}
