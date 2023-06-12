/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Hugo
 */
public class DetalleVenta {
    private int idDetalleVent;
    private int cantidad;
    private int idVenta;
    private double precioVenta;
    private int idProducto;

    public DetalleVenta() {
    }

    public DetalleVenta(int idDetalleVent, int cantidad, int idVenta, double precioVenta, int idProducto) {
        this.idDetalleVent = idDetalleVent;
        this.cantidad = cantidad;
        this.idVenta = idVenta;
        this.precioVenta = precioVenta;
        this.idProducto = idProducto;
    }

    public DetalleVenta(int cantidad, int idVenta, double precioVenta, int idProducto) {
        this.cantidad = cantidad;
        this.idVenta = idVenta;
        this.precioVenta = precioVenta;
        this.idProducto = idProducto;
    }

    public int getIdDetalleVent() {
        return idDetalleVent;
    }

    public void setIdDetalleVent(int idDetalleVent) {
        this.idDetalleVent = idDetalleVent;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" + "idDetalleVent=" + idDetalleVent + ", cantidad=" + cantidad + ", idVenta=" + idVenta + ", precioVenta=" + precioVenta + ", idProducto=" + idProducto + '}';
    }
    
}
