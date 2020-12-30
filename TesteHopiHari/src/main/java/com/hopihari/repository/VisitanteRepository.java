package com.hopihari.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.hopihari.entidade.Visitante;
import javax.persistence.Id;


public interface VisitanteRepository extends JpaRepository<Visitante, Id>{

}
