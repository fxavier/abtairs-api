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
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "spray_totals")
public class SprayTotals implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "A data é obrigatória")
	@Column(name = "spray_date")
	private LocalDate sprayDate;
	
	@NotNull
	@Column(name = "sprayed_structures")
	private Long sprayedStructures;
	
	@NotNull
	@Column(name = "sprayed_man")
	private Long sprayedMan;
	
	@NotNull
	@Column(name = "sprayed_women")
	private Long sprayedWomen;
	
	@NotNull
	@Column(name = "sprayed_pregnant_women")
	private Long sprayedPregnantWomen;
	
	@NotNull
	@Column(name = "sprayed_children")
	private Long sprayedChildren;
	
	@NotNull
	@Column(name = "structurs_not_sprayed")
	private Long notSprayedStructures;
	
	@NotNull
	@Column(name = "not_sprayed_men")
	private Long notSprayedMen;
	
	@NotNull
	@Column(name = "not_sprayed_women")
	private Long notSprayedWomen;
	
	@NotNull
	@Column(name = "not_sprayed_pregnant_women")
	private Long notSprayedPregnantWomen;
	
	@NotNull
	@Column(name = "not_sprayed_children")
	private Long notSprayedChildren;
	
	@NotNull
	@Column(name = "rooms_found")
	private Long roomsFound;
	
	@NotNull
	@Column(name = "rooms_sprayed")
	private Long roomsSprayed;
	
	@NotNull
	@Column(name = "insecticide_issued")
	private Long insecticideIssued;
	
	@NotNull
	@Column(name = "insecticide_full_returned")
	private Long insecticideFullReturned;
	
	@NotNull
	@Column(name = "insecticide_empty_returned")
	private Long insecticideEmptyReturned;
	
	
	private String reference;
	
	@ManyToOne
	@JoinColumn(name = "district_id")
	private District district;
	
	@ManyToOne
	@JoinColumn(name = "operational_site_id")
	private OperationalSite operationalSite;
	
	@ManyToOne
	@JoinColumn(name = "locality_id")
	private Locality locality;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "village_id")
	private Village village;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "sop_id")
	private SprayOperator sprayOperator;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "tl_id")
	private TeamLeader teamLeader;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getSprayDate() {
		return sprayDate;
	}

	public void setSprayDate(LocalDate sprayDate) {
		this.sprayDate = sprayDate;
	}

	public Long getSprayedStructures() {
		return sprayedStructures;
	}

	public void setSprayedStructures(Long sprayedStructures) {
		this.sprayedStructures = sprayedStructures;
	}

	public Long getSprayedMan() {
		return sprayedMan;
	}

	public void setSprayedMan(Long sprayedMan) {
		this.sprayedMan = sprayedMan;
	}

	public Long getSprayedWomen() {
		return sprayedWomen;
	}

	public void setSprayedWomen(Long sprayedWomen) {
		this.sprayedWomen = sprayedWomen;
	}

	public Long getSprayedPregnantWomen() {
		return sprayedPregnantWomen;
	}

	public void setSprayedPregnantWomen(Long sprayedPregnantWomen) {
		this.sprayedPregnantWomen = sprayedPregnantWomen;
	}

	public Long getSprayedChildren() {
		return sprayedChildren;
	}

	public void setSprayedChildren(Long sprayedChildren) {
		this.sprayedChildren = sprayedChildren;
	}

	public Long getNotSprayedStructures() {
		return notSprayedStructures;
	}

	public void setNotSprayedStructures(Long notSprayedStructures) {
		this.notSprayedStructures = notSprayedStructures;
	}

	public Long getNotSprayedMen() {
		return notSprayedMen;
	}

	public void setNotSprayedMen(Long notSprayedMen) {
		this.notSprayedMen = notSprayedMen;
	}

	public Long getNotSprayedWomen() {
		return notSprayedWomen;
	}

	public void setNotSprayedWomen(Long notSprayedWomen) {
		this.notSprayedWomen = notSprayedWomen;
	}

	public Long getNotSprayedPregnantWomen() {
		return notSprayedPregnantWomen;
	}

	public void setNotSprayedPregnantWomen(Long notSprayedPregnantWomen) {
		this.notSprayedPregnantWomen = notSprayedPregnantWomen;
	}

	public Long getNotSprayedChildren() {
		return notSprayedChildren;
	}

	public void setNotSprayedChildren(Long notSprayedChildren) {
		this.notSprayedChildren = notSprayedChildren;
	}

	public Long getRoomsFound() {
		return roomsFound;
	}

	public void setRoomsFound(Long roomsFound) {
		this.roomsFound = roomsFound;
	}

	public Long getRoomsSprayed() {
		return roomsSprayed;
	}

	public void setRoomsSprayed(Long roomsSprayed) {
		this.roomsSprayed = roomsSprayed;
	}

	public Long getInsecticideIssued() {
		return insecticideIssued;
	}

	public void setInsecticideIssued(Long insecticideIssued) {
		this.insecticideIssued = insecticideIssued;
	}

	public Long getInsecticideFullReturned() {
		return insecticideFullReturned;
	}

	public void setInsecticideFullReturned(Long insecticideFullReturned) {
		this.insecticideFullReturned = insecticideFullReturned;
	}

	public Long getInsecticideEmptyReturned() {
		return insecticideEmptyReturned;
	}

	public void setInsecticideEmptyReturned(Long insecticideEmptyReturned) {
		this.insecticideEmptyReturned = insecticideEmptyReturned;
	}

	

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Village getVillage() {
		return village;
	}

	public void setVillage(Village village) {
		this.village = village;
	}

	

	public SprayOperator getSprayOperator() {
		return sprayOperator;
	}

	public void setSprayOperator(SprayOperator sprayOperator) {
		this.sprayOperator = sprayOperator;
	}

	public TeamLeader getTeamLeader() {
		return teamLeader;
	}

	public void setTeamLeader(TeamLeader teamLeader) {
		this.teamLeader = teamLeader;
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

	@Transient
	public Boolean isNovo() {
		return this.id == null;
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
		SprayTotals other = (SprayTotals) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
