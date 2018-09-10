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
* @author
 *
 */
@Entity
@Table(name = "dos_totals")
public class DosTotals {
			
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private LocalDate data;
	
	@NotNull
	private Long SOPMixFor75Sim;
	
	@NotNull
	private Long SOPMixFor75Nao;
	    
	@NotNull
    private Long SOPEnxaugou3vezesSim;
	
	@NotNull
    private Long SOPEnxaugou3vezesNao;
	    
	@NotNull
    private Long SOPTemEPICompletoSim;
	    
	@NotNull
	private Long SOPTemEPICompletoNao;
	    
	@NotNull

	private Long SOPPulvComBombaComCntFluxoSim;
	    
	@NotNull
	private Long SOPPulvComBombaComCntFluxoNao;
	 
	@NotNull
	private Long todosPertencesForaCasaSim;
	  
	@NotNull
	private Long todosPertencesForaCasaNao;
	  
	@NotNull
	private Long todosPertencesNTiradosCobertosSim;
	  
	@NotNull
    private Long todosPertencesNTiradosCobertosNao;
	 
	@NotNull
	private Long existeVazamentoBombaSim;
	 
	@NotNull
	private Long existeVazamentoBombaNao;
	    
	@NotNull
	private Long SOPPulvComDist45cmParedeSim;
	    
	@NotNull
	private Long SOPPulvComDist45cmParedeNao;
	    
	@NotNull
	private Long SOPMantemVelocCorrectaSim;
	   
	@NotNull
	private Long SOPMantemVelocCorrectaNao;
	    
	@NotNull
	private Long existeSubreposicao5cmSim;
	    
	@NotNull
	private Long existeSubreposicao5cmNao;
	    
	 @ManyToOne
	 @JoinColumn(name = "tl_id")
	 private TeamLeader teamLeader;   
	    
	 @ManyToOne
	 @JoinColumn(name = "village_id")
	 private Village village;
	    
	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public LocalDate getData() {
			return data;
		}

		public void setData(LocalDate data) {
			this.data = data;
		}

		public Long getSOPMixFor75Sim() {
			return SOPMixFor75Sim;
		}

		public void setSOPMixFor75Sim(Long sOPMixFor75Sim) {
			SOPMixFor75Sim = sOPMixFor75Sim;
		}

		public Long getSOPMixFor75Nao() {
			return SOPMixFor75Nao;
		}

		public void setSOPMixFor75Nao(Long sOPMixFor75Nao) {
			SOPMixFor75Nao = sOPMixFor75Nao;
		}

		public Long getSOPEnxaugou3vezesSim() {
			return SOPEnxaugou3vezesSim;
		}

		public void setSOPEnxaugou3vezesSim(Long sOPEnxaugou3vezesSim) {
			SOPEnxaugou3vezesSim = sOPEnxaugou3vezesSim;
		}

		public Long getSOPEnxaugou3vezesNao() {
			return SOPEnxaugou3vezesNao;
		}

		public void setSOPEnxaugou3vezesNao(Long sOPEnxaugou3vezesNao) {
			SOPEnxaugou3vezesNao = sOPEnxaugou3vezesNao;
		}

		public Long getSOPTemEPICompletoSim() {
			return SOPTemEPICompletoSim;
		}

		public void setSOPTemEPICompletoSim(Long sOPTemEPICompletoSim) {
			SOPTemEPICompletoSim = sOPTemEPICompletoSim;
		}

		public Long getSOPTemEPICompletoNao() {
			return SOPTemEPICompletoNao;
		}

		public void setSOPTemEPICompletoNao(Long sOPTemEPICompletoNao) {
			SOPTemEPICompletoNao = sOPTemEPICompletoNao;
		}

		public Long getSOPPulvComBombaComCntFluxoSim() {
			return SOPPulvComBombaComCntFluxoSim;
		}

		public void setSOPPulvComBombaComCntFluxoSim(Long sOPPulvComBombaComCntFluxoSim) {
			SOPPulvComBombaComCntFluxoSim = sOPPulvComBombaComCntFluxoSim;
		}

		public Long getSOPPulvComBombaComCntFluxoNao() {
			return SOPPulvComBombaComCntFluxoNao;
		}

		public void setSOPPulvComBombaComCntFluxoNao(Long sOPPulvComBombaComCntFluxoNao) {
			SOPPulvComBombaComCntFluxoNao = sOPPulvComBombaComCntFluxoNao;
		}

		public Long getTodosPertencesForaCasaSim() {
			return todosPertencesForaCasaSim;
		}

		public void setTodosPertencesForaCasaSim(Long todosPertencesForaCasaSim) {
			this.todosPertencesForaCasaSim = todosPertencesForaCasaSim;
		}

		public Long getTodosPertencesForaCasaNao() {
			return todosPertencesForaCasaNao;
		}

		public void setTodosPertencesForaCasaNao(Long todosPertencesForaCasaNao) {
			this.todosPertencesForaCasaNao = todosPertencesForaCasaNao;
		}

		public Long getTodosPertencesNTiradosCobertosSim() {
			return todosPertencesNTiradosCobertosSim;
		}

		public void setTodosPertencesNTiradosCobertosSim(Long todosPertencesNTiradosCobertosSim) {
			this.todosPertencesNTiradosCobertosSim = todosPertencesNTiradosCobertosSim;
		}

		public Long getTodosPertencesNTiradosCobertosNao() {
			return todosPertencesNTiradosCobertosNao;
		}

		public void setTodosPertencesNTiradosCobertosNao(Long todosPertencesNTiradosCobertosNao) {
			this.todosPertencesNTiradosCobertosNao = todosPertencesNTiradosCobertosNao;
		}

		public Long getExisteVazamentoBombaSim() {
			return existeVazamentoBombaSim;
		}

		public void setExisteVazamentoBombaSim(Long existeVazamentoBombaSim) {
			this.existeVazamentoBombaSim = existeVazamentoBombaSim;
		}

		public Long getExisteVazamentoBombaNao() {
			return existeVazamentoBombaNao;
		}

		public void setExisteVazamentoBombaNao(Long existeVazamentoBombaNao) {
			this.existeVazamentoBombaNao = existeVazamentoBombaNao;
		}

		public Long getSOPPulvComDist45cmParedeSim() {
			return SOPPulvComDist45cmParedeSim;
		}

		public void setSOPPulvComDist45cmParedeSim(Long sOPPulvComDist45cmParedeSim) {
			SOPPulvComDist45cmParedeSim = sOPPulvComDist45cmParedeSim;
		}

		public Long getSOPPulvComDist45cmParedeNao() {
			return SOPPulvComDist45cmParedeNao;
		}

		public void setSOPPulvComDist45cmParedeNao(Long sOPPulvComDist45cmParedeNao) {
			SOPPulvComDist45cmParedeNao = sOPPulvComDist45cmParedeNao;
		}

		public Long getSOPMantemVelocCorrectaSim() {
			return SOPMantemVelocCorrectaSim;
		}

		public void setSOPMantemVelocCorrectaSim(Long sOPMantemVelocCorrectaSim) {
			SOPMantemVelocCorrectaSim = sOPMantemVelocCorrectaSim;
		}

		public Long getSOPMantemVelocCorrectaNao() {
			return SOPMantemVelocCorrectaNao;
		}

		public void setSOPMantemVelocCorrectaNao(Long sOPMantemVelocCorrectaNao) {
			SOPMantemVelocCorrectaNao = sOPMantemVelocCorrectaNao;
		}

		public Long getExisteSubreposicao5cmSim() {
			return existeSubreposicao5cmSim;
		}

		public void setExisteSubreposicao5cmSim(Long existeSubreposicao5cmSim) {
			this.existeSubreposicao5cmSim = existeSubreposicao5cmSim;
		}

		public Long getExisteSubreposicao5cmNao() {
			return existeSubreposicao5cmNao;
		}

		public void setExisteSubreposicao5cmNao(Long existeSubreposicao5cmNao) {
			this.existeSubreposicao5cmNao = existeSubreposicao5cmNao;
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
		DosTotals other = (DosTotals) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	

}
