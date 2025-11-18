package com.example.pescadito.Model;
import jakarta.persistence.*;

@Entity
@Table(name = "combinados")
public class Combinado {
    @Id
    private long id;

    @Column (nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String descripcion;

    @Column (nullable = false)
    private Double precio;

    @Column (nullable = false)
    private boolean disponible;

    @Column (nullable = false)
    private String categoria;

    public Combinado(){
    }

    public Combinado(long id, String nombre, String descripcion, Double precio, boolean disponible, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.disponible = disponible;
        this.categoria = categoria;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
