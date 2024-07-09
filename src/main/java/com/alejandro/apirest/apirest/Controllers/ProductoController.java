package com.alejandro.apirest.apirest.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.alejandro.apirest.apirest.Repositories.ProductoRepository;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.alejandro.apirest.apirest.Entities.Producto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping
    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }
    
    @PostMapping
    public Producto creaProducto(@RequestBody Producto producto) {
            return productoRepository.save(producto);
    }

    @GetMapping("/{id}")
    public Producto obtenerProductoPorId(@PathVariable Long id) {
        return productoRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("No se Encontro el Producto con el id"  + id));

    }

    @PutMapping("/{id}")
    public Producto actualizaProducto(@PathVariable Long id, @RequestBody Producto detallesProducto) {
        Producto producto = productoRepository.findById(id)
        .orElseThrow(()-> new RuntimeException("No se encontro el producto con el id "+ id));

        producto.setNombre(detallesProducto.getNombre());
        producto.setPrecio(detallesProducto.getPrecio());
        
        return productoRepository.save(producto);
    }

    @DeleteMapping("/{id}")
    public String eliminarProducto(@PathVariable Long id){
        Producto producto = productoRepository.findById(id)
        .orElseThrow(()-> new RuntimeException("No se encontro el producto con el id "+ id));
        productoRepository.delete(producto);
        return "El numero con el id " + id + " fue eliminado correctamente";


    }

}
