package com.idat.MarioAlejoTapullima.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.MarioAlejoTapullima.model.Lavadora;

@Repository
public interface LavadoraRepository extends JpaRepository<Lavadora,Integer> {

}
