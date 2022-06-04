package com.idat.MarioAlejoTapullima.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.MarioAlejoTapullima.model.Lavadora;
import com.idat.MarioAlejoTapullima.service.LavadoraService;

@Controller
@RequestMapping("/lavadora/v1")
public class LavadoraController {
	
	@Autowired
	private LavadoraService service;
	
	@GetMapping(path ="/listar")
	public @ResponseBody List<Lavadora> listar(){
		return service.listar();
	}
}
