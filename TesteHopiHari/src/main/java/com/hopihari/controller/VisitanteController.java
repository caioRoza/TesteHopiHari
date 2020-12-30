package com.hopihari.controller;

import java.util.List;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hopihari.entidade.Visitante;
import com.hopihari.exception.ResourceNotFoundException;
import com.hopihari.repository.VisitanteRepository;


@RestController 
@RequestMapping ("/hopi")
public class VisitanteController {
	
	@Autowired
	VisitanteRepository visitanteRepository;
	private Visitante visitante1;
	
	@GetMapping ("/visitantes") 
	public List<Visitante> getAllVisitante () { 
		return visitanteRepository.findAll (); 
	} 

	@PostMapping ("/addvisitantes") 
	public Visitante createVisitante (@RequestBody Visitante visitante) { 
		return visitanteRepository.save (visitante); 
	} 
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Visitante> deleteVisitante(@PathVariable(value = "id") Long visitanteId, Id id ) {
		Visitante visitante = visitanteRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Visitante", "id", visitanteId));

		visitanteRepository.delete(visitante);

		return ResponseEntity.ok().build();
	}
	
	@PutMapping("/atualizar/{id}")
	public Visitante updateVisitante(@PathVariable(value = "id") Long visitanteId,Id id, @RequestBody Visitante visitante) {

		setVisitante1(visitanteRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Comment", "id", visitanteId)));

		visitante.setNomeVisitante(visitante.getNomeVisitante());
		visitante.setRgVisitante(visitante.getRgVisitante());
		visitante.setEmailVisitante(visitante.getEmailVisitante());
		visitante.setCidadeVisitante(visitante.getCidadeVisitante());
		visitante.setAnualiVisitante(visitante.getAnualiVisitante());

		Visitante updatedVisitante = visitanteRepository.save(visitante);
		return updatedVisitante;
	}

	public Visitante getVisitante1() {
		return visitante1;
	}

	public void setVisitante1(Visitante visitante1) {
		this.visitante1 = visitante1;
	}
}
