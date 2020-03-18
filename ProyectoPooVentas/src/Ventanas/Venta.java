package Ventanas;
/**
 * Proyecto Bimestral Programación Orientada a Objetos
 * @author davisalex22
 */
public class Venta {
    
  // Declaracion de Variables
     String ID_ProductoVenta,NombreProductoVenta,CantidadVenta,PrecioVenta; 

    /**
     * Método Constructor de la clase Venta
     * @param ID_ProductoVenta
     * @param NombreProductoVenta
     * @param CantidadVenta
     * @param PrecioVenta
     */ 

    public Venta(String ID_ProductoVenta, String NombreProductoVenta, String CantidadVenta, String PrecioVenta) {
        this.ID_ProductoVenta = ID_ProductoVenta;
        this.NombreProductoVenta = NombreProductoVenta;
        this.CantidadVenta = CantidadVenta;
        this.PrecioVenta = PrecioVenta;
    }

    // Métodos get y set de la clase Stock
     public String getID_ProductoVenta() {
        return ID_ProductoVenta;
    }

    public void setID_ProductoVenta(String ID_ProductoVenta) {
        this.ID_ProductoVenta = ID_ProductoVenta;
    }

    public String getNombreProductoVenta() {
        return NombreProductoVenta;
    }

    public void setNombreProductoVenta(String NombreProductoVenta) {
        this.NombreProductoVenta = NombreProductoVenta;
    }

    public String getCantidadVenta() {
        return CantidadVenta;
    }

    public void setCantidadVenta(String CantidadVenta) {
        this.CantidadVenta = CantidadVenta;
    }

    public String getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(String PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }
   
}
