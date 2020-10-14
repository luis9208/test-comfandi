package com.comfandi.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comfandi.demo.model.Venta;
import com.comfandi.demo.model.VentaTransformada;
import com.comfandi.demo.repsitory.VentaTransformadaRepository;

@RestController
@RequestMapping("/api/v1/")
public class VentaTransformadaController {

	private VentaController ventaController;
	
	@Autowired
    private VentaTransformadaRepository ventaTransformadaRepository; 
	
	public  VentaTransformadaController() {
		// TODO Auto-generated constructor stub
		this.ventaController = new VentaController();
	}
	
	
	@PostMapping("venta-transformada")
	public List<VentaTransformada> crearVentaTransformada() {
		
		List<Venta> ventas = this.ventaController.getAllVentas();
		System.out.println(ventas);
		List<VentaTransformada> vtr = null;
		for (Venta venta : ventas) {
			VentaTransformada vt = new VentaTransformada(venta.getId(), venta.getFechaTransaccion(),
					venta.getCodigoTienda(),"sociedad","budat", "mes",
					"COP","referencia", "texto cabecera", "num consec contable", "40", "cuenta de mayor",
					"numero contable", venta.getValorTransaccion(),
					venta.getNumAprobacion(), "centro beneficio"
					);
			this.ventaTransformadaRepository.save(vt);
			vtr.add(vt);
		}
		
		return vtr;
	}
	
}
