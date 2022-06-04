package com.idat.MarioAlejoTapullima.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name="Lavadora")
@Entity
public class Lavadora {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idLavadora;
	private String descripcionLavadora;
	private String marcaLavadora;
	private Integer voltajeLavadora;

	

}
