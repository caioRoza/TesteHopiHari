package com.hopihari.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "visitante")
public class Visitante implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	
	@Column(name = "nome")
	public String nomeVisitante;
	
	@Column(name = "rg")
	public String rgVisitante;
	
	@Column(name = "email")
	public String emailVisitante;
	
	@Column(name = "cidade")
	public String cidadeVisitante;
	
	@Column(name = "anuali")
	public String anualiVisitante;
	
	
	
	public Visitante (String nomeVisitante, String rgVisitante, String emailVisitante, 
			  String cidadeVisitante, String anualiVisitante ) {

this.nomeVisitante = nomeVisitante;
this.rgVisitante = rgVisitante;
this.emailVisitante = emailVisitante;
this.cidadeVisitante = cidadeVisitante;
this.anualiVisitante = anualiVisitante;	
}

public String getNomeVisitante() {
return nomeVisitante;
}

public void setNomeVisitante(String nomeVisitante) {
this.nomeVisitante = nomeVisitante;
}

public String getRgVisitante() {
return rgVisitante;
}

public void setRgVisitante(String rgVisitante) {
this.rgVisitante = rgVisitante;
}

public String getEmailVisitante() {
return emailVisitante;
}

public void setEmailVisitante(String emailVisitante) {
this.emailVisitante = emailVisitante;
}

public String getCidadeVisitante() {
return cidadeVisitante;
}

public void setCidadeVisitante(String cidadeVisitante) {
this.cidadeVisitante = cidadeVisitante;
}

public String getAnualiVisitante() {
return anualiVisitante;
}

public void setAnualiVisitante(String anualiVisitante) {
this.anualiVisitante = anualiVisitante;
}

public Visitante orElse(Object object) {
	// TODO Auto-generated method stub
	return null;
}


}
