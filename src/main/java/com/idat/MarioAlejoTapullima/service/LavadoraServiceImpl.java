package com.idat.MarioAlejoTapullima.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MarioAlejoTapullima.model.Lavadora;
import com.idat.MarioAlejoTapullima.repository.LavadoraRepository;

@Service
public class LavadoraServiceImpl implements LavadoraService {

	@Autowired
	private LavadoraRepository repository;
	@Override
	public List<Lavadora> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
