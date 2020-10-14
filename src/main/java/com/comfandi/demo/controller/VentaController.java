package com.comfandi.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comfandi.demo.exception.ResourceNotFound;
import com.comfandi.demo.model.Venta;
import com.comfandi.demo.repsitory.VentaRepository;

@RestController
@RequestMapping("/api/v1/")
public class VentaController {
    
    @Autowired
    private VentaRepository ventaRepository;
    
    // get Ventas
    @GetMapping("ventas")
    public java.util.List<Venta> getAllVentas(){
    	System.out.println("ppppppppppppppppppppp");
        return this.ventaRepository.findAll();
    }

    //parametro tipo nombre
    @GetMapping("/ventas/{id}")
    public ResponseEntity<Venta> getVentaById(@PathVariable(value = "id") Long ventaId) throws ResourceNotFound {
        Venta venta = ventaRepository.findById(ventaId).orElseThrow(
            ()-> new ResourceNotFound("El id venta :: "+ventaId+" no existe")
        );
        return ResponseEntity.ok().body(venta);
    }

    @PostMapping("ventas")
    public Venta creatVenta(@RequestBody Venta venta){
        return this.ventaRepository.save(venta);
    }
}

