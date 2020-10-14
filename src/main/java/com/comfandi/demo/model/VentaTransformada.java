package com.comfandi.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estructura_sap_tv")
public class VentaTransformada {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name= "CONSE")
	private long CONSE;
	@Column(name= "bldat")
	private String bldat;
	@Column(name= "BLART")
	private String BLART;
	@Column(name= "BUKRS")
	private String BUKRS;
	@Column(name= "budat")
	private String budat; // Fecha creacion
	@Column(name= "monat")
	private String monat; // mes
	@Column(name= "WAERS")
	private String WAERS;
	@Column(name= "xblnr")
	private String xblnr; // cecos+fecha; si cod 50 MER+fecha
	@Column(name= "BKTXT")
	private String BKTXT;
	@Column(name= "buzei")
	private String buzei; //consecutivo
	@Column(name= "BSCHL")
	private String BSCHL; //40 es detalle; 50 es total de dicho detalle
	@Column(name= "UMSKZ")
	private String UMSKZ;
	@Column(name= "KUNNR")
	private String KUNNR;
	@Column(name= "LIFNR")
	private String LIFNR;
	@Column(name= "HKONT")
	private String HKONT;
	@Column(name= "wrbtr")
	private double wrbtr;
	@Column(name= "MWSKZ")
	private String MWSKZ;
	@Column(name= "VALUT")
	private String VALUT;
	@Column(name= "ZFBDT")
	private String ZFBDT;
	@Column(name= "ZTERM")
	private String ZTERM;
	private String ZUONR, SGTXT,ZEILE;
	private String PRCTR,KOSTL, AUFNR, XREF1, XREF2, XREF3, FIPEX, FISTL;
	private String FKBER, GEBER, MEASURE, KBLNR, QSSKZ;

	public VentaTransformada() {
	}

	public VentaTransformada(long CONSE, String bldat, 
	String BLART, String BUKRS, String budat, String monat, 
	String WAERS, String xblnr, String BKTXT, String buzei, 
	String BSCHL, String UMSKZ,	String HKONT, double wrbtr, String ZUONR, String PRCTR) {
		this.CONSE = CONSE;
		this.bldat = bldat;
		this.BLART = BLART;
		this.BUKRS = BUKRS;
		this.budat = budat;
		this.monat = monat;
		this.WAERS = WAERS;
		this.xblnr = xblnr;
		this.BKTXT = BKTXT;
		this.buzei = buzei;
		this.BSCHL = BSCHL;
		this.UMSKZ = "";
		this.KUNNR = "";
		this.LIFNR = "";
		this.HKONT = HKONT;
		this.wrbtr = wrbtr;
		this.MWSKZ = "";
		this.VALUT = "";
		this.ZFBDT = "";
		this.ZTERM = "";
		this.ZUONR = ZUONR;
		this.SGTXT = "";
		this.ZEILE = "";
		this.PRCTR = PRCTR;
		this.KOSTL = "";
		this.AUFNR = "";
		this.XREF1 = "";
		this.XREF2 = "";
		this.XREF3 = "";
		this.FIPEX = "";
		this.FISTL = "";
		this.FKBER = "";
		this.GEBER = "";
		this.MEASURE = "";
		this.KBLNR = "";
		this.QSSKZ = "";
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCONSE() {
		return this.CONSE;
	}

	public void setCONSE(long CONSE) {
		this.CONSE = CONSE;
	}

	public String getBldat() {
		return this.bldat;
	}

	public void setBldat(String bldat) {
		this.bldat = bldat;
	}

	public String getBLART() {
		return this.BLART;
	}

	public void setBLART(String BLART) {
		this.BLART = BLART;
	}

	public String getBUKRS() {
		return this.BUKRS;
	}

	public void setBUKRS(String BUKRS) {
		this.BUKRS = BUKRS;
	}

	public String getBudat() {
		return this.budat;
	}

	public void setBudat(String budat) {
		this.budat = budat;
	}

	public String getMonat() {
		return this.monat;
	}

	public void setMonat(String monat) {
		this.monat = monat;
	}

	public String getWAERS() {
		return this.WAERS;
	}

	public void setWAERS(String WAERS) {
		this.WAERS = WAERS;
	}

	public String getXblnr() {
		return this.xblnr;
	}

	public void setXblnr(String xblnr) {
		this.xblnr = xblnr;
	}

	public String getBKTXT() {
		return this.BKTXT;
	}

	public void setBKTXT(String BKTXT) {
		this.BKTXT = BKTXT;
	}

	public String getBuzei() {
		return this.buzei;
	}

	public void setBuzei(String buzei) {
		this.buzei = buzei;
	}

	public String getBSCHL() {
		return this.BSCHL;
	}

	public void setBSCHL(String BSCHL) {
		this.BSCHL = BSCHL;
	}

	public String getUMSKZ() {
		return this.UMSKZ;
	}

	public void setUMSKZ(String UMSKZ) {
		this.UMSKZ = UMSKZ;
	}

	public String getKUNNR() {
		return this.KUNNR;
	}

	public void setKUNNR(String KUNNR) {
		this.KUNNR = KUNNR;
	}

	public String getLIFNR() {
		return this.LIFNR;
	}

	public void setLIFNR(String LIFNR) {
		this.LIFNR = LIFNR;
	}

	public String getHKONT() {
		return this.HKONT;
	}

	public void setHKONT(String HKONT) {
		this.HKONT = HKONT;
	}

	public double getWrbtr() {
		return this.wrbtr;
	}

	public void setWrbtr(double wrbtr) {
		this.wrbtr = wrbtr;
	}

	public String getMWSKZ() {
		return this.MWSKZ;
	}

	public void setMWSKZ(String MWSKZ) {
		this.MWSKZ = MWSKZ;
	}

	public String getVALUT() {
		return this.VALUT;
	}

	public void setVALUT(String VALUT) {
		this.VALUT = VALUT;
	}

	public String getZFBDT() {
		return this.ZFBDT;
	}

	public void setZFBDT(String ZFBDT) {
		this.ZFBDT = ZFBDT;
	}

	public String getZTERM() {
		return this.ZTERM;
	}

	public void setZTERM(String ZTERM) {
		this.ZTERM = ZTERM;
	}

	public String getZUONR() {
		return this.ZUONR;
	}

	public void setZUONR(String ZUONR) {
		this.ZUONR = ZUONR;
	}

	public String getSGTXT() {
		return this.SGTXT;
	}

	public void setSGTXT(String SGTXT) {
		this.SGTXT = SGTXT;
	}

	public String getZEILE() {
		return this.ZEILE;
	}

	public void setZEILE(String ZEILE) {
		this.ZEILE = ZEILE;
	}

	public String getPRCTR() {
		return this.PRCTR;
	}

	public void setPRCTR(String PRCTR) {
		this.PRCTR = PRCTR;
	}

	public String getKOSTL() {
		return this.KOSTL;
	}

	public void setKOSTL(String KOSTL) {
		this.KOSTL = KOSTL;
	}

	public String getAUFNR() {
		return this.AUFNR;
	}

	public void setAUFNR(String AUFNR) {
		this.AUFNR = AUFNR;
	}

	public String getXREF1() {
		return this.XREF1;
	}

	public void setXREF1(String XREF1) {
		this.XREF1 = XREF1;
	}

	public String getXREF2() {
		return this.XREF2;
	}

	public void setXREF2(String XREF2) {
		this.XREF2 = XREF2;
	}

	public String getXREF3() {
		return this.XREF3;
	}

	public void setXREF3(String XREF3) {
		this.XREF3 = XREF3;
	}

	public String getFIPEX() {
		return this.FIPEX;
	}

	public void setFIPEX(String FIPEX) {
		this.FIPEX = FIPEX;
	}

	public String getFISTL() {
		return this.FISTL;
	}

	public void setFISTL(String FISTL) {
		this.FISTL = FISTL;
	}

	public String getFKBER() {
		return this.FKBER;
	}

	public void setFKBER(String FKBER) {
		this.FKBER = FKBER;
	}

	public String getGEBER() {
		return this.GEBER;
	}

	public void setGEBER(String GEBER) {
		this.GEBER = GEBER;
	}

	public String getMEASURE() {
		return this.MEASURE;
	}

	public void setMEASURE(String MEASURE) {
		this.MEASURE = MEASURE;
	}

	public String getKBLNR() {
		return this.KBLNR;
	}

	public void setKBLNR(String KBLNR) {
		this.KBLNR = KBLNR;
	}

	public String getQSSKZ() {
		return this.QSSKZ;
	}

	public void setQSSKZ(String QSSKZ) {
		this.QSSKZ = QSSKZ;
	}

}
