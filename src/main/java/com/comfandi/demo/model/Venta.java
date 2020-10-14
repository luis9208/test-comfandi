package com.comfandi.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estructura_pos_ventas")
public class Venta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "detalle")
    private String detalle;
    
    @Column(name = "codigo_tienda")
    private String codigoTienda;

    @Column(name = "numero_caja")
    private String numCaja;

    @Column(name = "numero_de_transaccion")
    private String numTransaccion;

    @Column(name = "codigo_cajero")
    private String codigoCajero;

    @Column(name = "fecha_de_transaccion")
    private String fechaTransaccion;

    @Column(name = "hora_de_transaccion")
    private String horaTransaccion;

    @Column(name = "signo_de_operacion")
    private String signoOperacion;

    @Column(name = "valor_transaccion")
    private double valorTransaccion;

    @Column(name = "numero_aprobacion")
    private String numAprobacion;

    @Column(name = "tipo_de_venta")
    private String tipoVenta;

    public Venta(){
        super();
    }


    public Venta(String detalle, String codigoTienda, String numCaja, 
                String numTransaccion, String codigoCajero, String fechaTransaccion,
                String horaTransaccion, String signoOperacion, double valorTransaccion,
                String numAprobacion, String tipoVenta) {
        super();
        this.detalle = detalle;
        this.codigoTienda = codigoTienda;
        this.numCaja = numCaja;
        this.numTransaccion = numTransaccion;
        this.codigoCajero = codigoCajero;
        this.fechaTransaccion = fechaTransaccion;
        this.horaTransaccion = horaTransaccion;
        this.signoOperacion = signoOperacion;
        this.valorTransaccion = valorTransaccion;
        this.numAprobacion = numAprobacion;
        this.tipoVenta = tipoVenta;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDetalle() {
        return this.detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getCodigoTienda() {
        return this.codigoTienda;
    }

    public void setCodigoTienda(String codigoTienda) {
        this.codigoTienda = codigoTienda;
    }

    public String getNumCaja() {
        return this.numCaja;
    }

    public void setNumCaja(String numCaja) {
        this.numCaja = numCaja;
    }

    public String getNumTransaccion() {
        return this.numTransaccion;
    }

    public void setNumTransaccion(String numTransaccion) {
        this.numTransaccion = numTransaccion;
    }

    public String getCodigoCajero() {
        return this.codigoCajero;
    }

    public void setCodigoCajero(String codigoCajero) {
        this.codigoCajero = codigoCajero;
    }

    public String getFechaTransaccion() {
        return this.fechaTransaccion;
    }

    public void setFechaTransaccion(String fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public String getHoraTransaccion() {
        return this.horaTransaccion;
    }

    public void setHoraTransaccion(String horaTransaccion) {
        this.horaTransaccion = horaTransaccion;
    }

    public String getSignoOperacion() {
        return this.signoOperacion;
    }

    public void setSignoOperacion(String signoOperacion) {
        this.signoOperacion = signoOperacion;
    }

    public double getValorTransaccion() {
        return this.valorTransaccion;
    }

    public void setValorTransaccion(double valorTransaccion) {
        this.valorTransaccion = valorTransaccion;
    }

    public String getNumAprobacion() {
        return this.numAprobacion;
    }

    public void setNumAprobacion(String numAprobacion) {
        this.numAprobacion = numAprobacion;
    }

    public String getTipoVenta() {
        return this.tipoVenta;
    }

    public void setTipoVenta(String tipoVenta) {
        this.tipoVenta = tipoVenta;
    }
}