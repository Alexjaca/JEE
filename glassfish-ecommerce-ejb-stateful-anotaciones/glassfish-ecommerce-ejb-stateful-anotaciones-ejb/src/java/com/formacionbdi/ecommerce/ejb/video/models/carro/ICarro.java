/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formacionbdi.ecommerce.ejb.video.models.carro;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Andrés Guzmán
 */

@Local
public interface ICarro {

    public void addProducto(ItemCarro newProducto);

    public void setItems(List<ItemCarro> otrosProductos);

    public void setSize(int size);

    public int getSize();

    public void empty();

    public double getTotalPrecio();

    public void removeProducto(String productoId);

    public void removeProductos(List<String> productoIds);

    public void updateCantidad(String productoId, int cantidad);

    public List<ItemCarro> getItems();
}
