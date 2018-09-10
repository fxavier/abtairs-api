/**
 * 
 */
package com.xavier.abtairsapi.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



/**
 * @author xavier
 *
 */
@Entity
@Table(name = "dos_details")
public class DosDetails {
		

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
		
	@NotNull
	private LocalDate data;
	
	@NotNull
	private String sopMixFor75;
	
	@NotNull
	private String sopEnxaugou3vezes;
	
	@NotNull
	private String sopTemEPICompleto;
	
	@NotNull
	private String sopPulvComBombaComCntFluxo;	

	@NotNull
	private String todosPertencesForaCasa;	

	@NotNull
	private String todosPertencesNTiradosCobertos;
	
	@NotNull
	private String existeVazamentoBomba;
	
	@NotNull
	private String sopPulvComDist45cmParede;
	
	@NotNull
	private String sopMantemVelocCorrecta;
	
	@NotNull
	private String existeSubreposicao5cm;
	
	@ManyToOne
	@JoinColumn(name = "dos_totals-id")
    private DosTotals dosTotals;
	
	@ManyToOne
	@JoinColumn(name = "sop_id")
	private SprayOperator sprayOperator;
	

	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long codigo) {
		this.id = codigo;
	}
	    
	

	public String getSopMixFor75() {
		return sopMixFor75;
	}

	public void setSopMixFor75(String sopMixFor75) {
		this.sopMixFor75 = sopMixFor75;
	}

	public String getSopEnxaugou3vezes() {
		return sopEnxaugou3vezes;
	}

	public void setSopEnxaugou3vezes(String sopEnxaugou3vezes) {
		this.sopEnxaugou3vezes = sopEnxaugou3vezes;
	}

	public String getSopTemEPICompleto() {
		return sopTemEPICompleto;
	}

	public void setSopTemEPICompleto(String sopTemEPICompleto) {
		this.sopTemEPICompleto = sopTemEPICompleto;
	}

	public String getSopPulvComBombaComCntFluxo() {
		return sopPulvComBombaComCntFluxo;
	}

	public void setSopPulvComBombaComCntFluxo(String sopPulvComBombaComCntFluxo) {
		this.sopPulvComBombaComCntFluxo = sopPulvComBombaComCntFluxo;
	}

	public String getTodosPertencesForaCasa() {
		return todosPertencesForaCasa;
	}

	public void setTodosPertencesForaCasa(String todosPertencesForaCasa) {
		this.todosPertencesForaCasa = todosPertencesForaCasa;
	}

	public String getTodosPertencesNTiradosCobertos() {
		return todosPertencesNTiradosCobertos;
	}

	public void setTodosPertencesNTiradosCobertos(String todosPertencesNTiradosCobertos) {
		this.todosPertencesNTiradosCobertos = todosPertencesNTiradosCobertos;
	}

	public String getExisteVazamentoBomba() {
		return existeVazamentoBomba;
	}

	public void setExisteVazamentoBomba(String existeVazamentoBomba) {
		this.existeVazamentoBomba = existeVazamentoBomba;
	}

	public String getSopPulvComDist45cmParede() {
		return sopPulvComDist45cmParede;
	}

	public void setSopPulvComDist45cmParede(String sopPulvComDist45cmParede) {
		this.sopPulvComDist45cmParede = sopPulvComDist45cmParede;
	}

	public String getSopMantemVelocCorrecta() {
		return sopMantemVelocCorrecta;
	}

	public void setSopMantemVelocCorrecta(String sopMantemVelocCorrecta) {
		this.sopMantemVelocCorrecta = sopMantemVelocCorrecta;
	}

	public String getExisteSubreposicao5cm() {
		return existeSubreposicao5cm;
	}

	public void setExisteSubreposicao5cm(String existeSubreposicao5cm) {
		this.existeSubreposicao5cm = existeSubreposicao5cm;
	}
    


	public SprayOperator getSprayOperator() {
		return sprayOperator;
	}


	public void setSprayOperator(SprayOperator sprayOperator) {
		this.sprayOperator = sprayOperator;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DosDetails other = (DosDetails) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	

}
