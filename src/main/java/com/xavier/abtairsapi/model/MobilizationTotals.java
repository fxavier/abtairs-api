package com.xavier.abtairsapi.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "mob_totals")
public class MobilizationTotals implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Column(name = "date_mob")
	private LocalDate mobDate;
	
	@NotNull
	@Column(name = "found_structures")
	private Long foundStructures;
	
	@NotNull
	@Column(name = "sentitized_structures_yes")
	private Long sentitizedStructrsYes;
	
	@NotNull
	@Column(name = "sentitized_structures_no")
	private Long sentitizedStructuresNo;
	
	@NotNull
	@Column(name = "men_sentitized_yes")
	private Long menSentitizedYes;
	
	@NotNull
	@Column(name = "men_sentitized_no")
	private Long menSentitizedNo;
	
	@NotNull
	@Column(name = "women_sentitized_yes")
	private Long womenSentitizedYes;
	
	@NotNull
	@Column(name = "women_sentitized_no")
	private Long womenSentitizedNo;
	
	@NotNull
	@Column(name = "spray_accpetance_yes")
	private Long sprayAcceptanceYes;
	
	@NotNull
	@Column(name = "spray_acceptance_no")
	private long sprayAcceptanceNo;
	
	private String reference;
	
	@ManyToOne
	@JoinColumn(name = "mobilizer_id")
	private Mobilizer mobilizer;
	
	@ManyToOne
	@JoinColumn(name = "district_id")
	private District district;
	
	@ManyToOne
	@JoinColumn(name = "operational_site_id")
	private OperationalSite operationalSite;
	
	@ManyToOne
	@JoinColumn(name = "locality_id")
	private Locality locality;
	
	@ManyToOne
	@JoinColumn(name = "village_id")
	private Village village;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getMobDate() {
		return mobDate;
	}

	public void setMobDate(LocalDate mobDate) {
		this.mobDate = mobDate;
	}

	public Long getFoundStructures() {
		return foundStructures;
	}

	public void setFoundStructures(Long foundStructures) {
		this.foundStructures = foundStructures;
	}

	public Long getSentitizedStructrsYes() {
		return sentitizedStructrsYes;
	}

	public void setSentitizedStructrsYes(Long sentitizedStructrsYes) {
		this.sentitizedStructrsYes = sentitizedStructrsYes;
	}

	public Long getSentitizedStructuresNo() {
		return sentitizedStructuresNo;
	}

	public void setSentitizedStructuresNo(Long sentitizedStructuresNo) {
		this.sentitizedStructuresNo = sentitizedStructuresNo;
	}

	public Long getMenSentitizedYes() {
		return menSentitizedYes;
	}

	public void setMenSentitizedYes(Long menSentitizedYes) {
		this.menSentitizedYes = menSentitizedYes;
	}

	public Long getMenSentitizedNo() {
		return menSentitizedNo;
	}

	public void setMenSentitizedNo(Long menSentitizedNo) {
		this.menSentitizedNo = menSentitizedNo;
	}

	public Long getWomenSentitizedYes() {
		return womenSentitizedYes;
	}

	public void setWomenSentitizedYes(Long womenSentitizedYes) {
		this.womenSentitizedYes = womenSentitizedYes;
	}

	public Long getWomenSentitizedNo() {
		return womenSentitizedNo;
	}

	public void setWomenSentitizedNo(Long womenSentitizedNo) {
		this.womenSentitizedNo = womenSentitizedNo;
	}

	public Long getSprayAcceptanceYes() {
		return sprayAcceptanceYes;
	}

	public void setSprayAcceptanceYes(Long sprayAcceptanceYes) {
		this.sprayAcceptanceYes = sprayAcceptanceYes;
	}

	public long getSprayAcceptanceNo() {
		return sprayAcceptanceNo;
	}

	public void setSprayAcceptanceNo(long sprayAcceptanceNo) {
		this.sprayAcceptanceNo = sprayAcceptanceNo;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Mobilizer getMobilizer() {
		return mobilizer;
	}

	public void setMobilizer(Mobilizer mobilizer) {
		this.mobilizer = mobilizer;
	}
	
	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public OperationalSite getOperationalSite() {
		return operationalSite;
	}

	public void setOperationalSite(OperationalSite operationalSite) {
		this.operationalSite = operationalSite;
	}

	public Locality getLocality() {
		return locality;
	}

	public void setLocality(Locality locality) {
		this.locality = locality;
	}

	public Village getVillage() {
		return village;
	}

	public void setVillage(Village village) {
		this.village = village;
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
		MobilizationTotals other = (MobilizationTotals) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
