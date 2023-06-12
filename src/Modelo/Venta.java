/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author Hugo
 */
public class Venta {
    private Producto producto;
    private Cliente cliente;
    private LocalDate fechaVenta;

    public Venta() {
    }

    public Venta(Producto producto, Cliente cliente, LocalDate fechaVenta) {
        this.producto = producto;
        this.cliente = cliente;
        this.fechaVenta = fechaVenta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    @Override
    public String toString() {
        return "Venta{" + "producto=" + producto + ", cliente=" + cliente + ", fechaVenta=" + fechaVenta + '}';
    }

    
    
    
}
