package com.comfandi.demo.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comfandi.demo.model.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long>{

}
