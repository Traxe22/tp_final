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
    private int idProducto;
    private int idCliente;
    private LocalDate fechaVenta;

    public Venta() {
    }

    public Venta(int idCliente, LocalDate fechaVenta) {
        this.idCliente = idCliente;
        this.fechaVenta = fechaVenta;
    }

    public Venta(int idProducto, int idCliente, LocalDate fechaVenta) {
        this.idProducto = idProducto;
        this.idCliente = idCliente;
        this.fechaVenta = fechaVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    @Override
    public String toString() {
        return "Venta{" + "idProducto=" + idProducto + ", idCliente=" + idCliente + ", fechaVenta=" + fechaVenta + '}';
    }
    
}
