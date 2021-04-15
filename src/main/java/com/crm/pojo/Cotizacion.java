package com.crm.pojo;

import lombok.Data;

@Data
public class Cotizacion {
	private int idCotizacion;
	private String fecha;
	private  int fk_lead;
	private String observacion;

}
