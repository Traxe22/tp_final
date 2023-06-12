/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_final_g6;

import Control.ClienteData;
import Control.DetalleVentaData;
import Control.ProductoData;
import Control.ProveedorData;
import Control.VentaData;
import Modelo.Cliente;
import Modelo.Producto;
import Modelo.Proveedor;
import Modelo.Venta;
import java.time.LocalDate;

/**
 *
 * @author Hugo
 */
public class Tp_final_g6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Cliente cli = new Cliente("Subidia", "Santiago", "500Sur", "2664466570");
//        ClienteData cliData = new ClienteData();
//        cliData.agregarCliente(cli);

//        Proveedor pro = new Proveedor("Bebidas", "Centro", "2664727272");
//        ProveedorData proData = new ProveedorData();
//        proData.agregarProveedor(pro);

//        Producto proD= new Producto("Lacteo", 20.99, 3, true);
//        ProductoData proDData = new ProductoData();
//        proDData.agregarProducto(proD);


//        Cliente cli1 = new Cliente("Barbagallo", "Valentina", "Centro", "2664466");
//        ClienteData cliData = new ClienteData();
//        cliData.agregarCliente(cli1);
//        
//        Producto proD= new Producto("Chocolate", 30.99, 3, true);
//        ProductoData proDData = new ProductoData();
//        proDData.agregarProducto(proD);

        LocalDate fechaVenta = LocalDate.now();
//        Venta ven = new Venta(fechaVenta, 3);
//        
//        VentaData venData = new VentaData();
//        venData.registarVenta(1,fechaVenta);
          
//          Producto pro = new Producto("Alfajor", "Jorgito", 39.9, 3, true);
//          ProductoData proData = new ProductoData();
//          proData.agregarProducto(pro);

//            Venta ven = new Venta(fechaVenta, 1, 6);
//            VentaData venData = new VentaData();
//            venData.registarVenta(ven);
//            Cliente cliente = new Cliente();
//            cliente.setIdCliente(1); // ID del cliente que deseas modificar
//            cliente.setApellido("Muñoz");
//            cliente.setNombre("Jose");
//            cliente.setDomicilio("Buenos aires");
//            cliente.setTelefono("2665");
//
//            ClienteData clienteData = new ClienteData();
//            clienteData.modificarCliente(cliente);
//            
//            ClienteData clienteData = new ClienteData();
//            clienteData.eliminarCliente(3);


//            VentaData ventaData = new VentaData();
//            DetalleVentaData detalleVentaData = new DetalleVentaData();
//            System.out.println("-> "+detalleVentaData.consultarDetallesVenta());
//            System.out.println("");

//              ProveedorData proData = new ProveedorData();
//              System.out.println("->"+proData.obtenerProveedores());
              ProductoData proData = new ProductoData();
              //proData.sumarStock(6, 1);
              proData.restarStock(6, 4);
    }
    
}
