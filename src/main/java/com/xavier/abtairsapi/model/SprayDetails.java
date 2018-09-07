package com.xavier.abtairsapi.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "spray_details")
public class SprayDetails implements Serializable{


	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Column(name = "spray_date")
	private LocalDate sprayDate;
	
	
	@NotNull
	@Column(name = "household_name")
	private String houseHoldName;
	
	
	@Enumerated(EnumType.STRING)
	@Column(name = "gender_person_interviwed")
	private Gender genderInterviwedPerson;
	

	@NotNull
	@Column(name = "household_id")
	private String houseHoldId;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	private SprayStatus sprayStatus;
	
	
	
	@Column(name = "sprayed_men")
	private Long sprayedMan;
	
	
	@Column(name = "sprayed_women")
	private Long sprayedWomen;
	
	
	@Column(name = "sprayed_pregnant_women")
	private Long sprayedPregnantWomen;
	
	
	@Column(name = "sprayed_children")
	private Long sprayedChildren;
	
	
	
	@Column(name = "not_sprayed_men")
	private Long notSprayedMen;
	
	
	@Column(name = "not_sprayed_women")
	private Long notSprayedWomen;
	
	
	@Column(name = "not_sprayed_pregnant_women")
	private Long notSprayedPregnantWomen;
	
	
	@Column(name = "not_sprayed_children")
	private Long notSprayedChildren;
	
	
	@Column(name = "rooms_found")
	private Long roomsFound;
	
	
	@Column(name = "rooms_sprayed")
	private Long roomsSprayed;
	
	
	@Enumerated(EnumType.STRING)
	@Column(name = "reason_not_sprayed")
	private ReasonNotSprayed reasonNotSprayed;
	
	
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
	
	
	@ManyToOne
	@JoinColumn(name = "spray_totals_id")
	private SprayTotals sprayTotals;
	
	@Column(name = "study_code")
	private String studyCode;

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

	public String getHouseHoldName() {
		return houseHoldName;
	}

	public void setHouseHoldName(String houseHoldName) {
		this.houseHoldName = houseHoldName;
	}

	public Gender getGenderInterviwedPerson() {
		return genderInterviwedPerson;
	}

	public void setGenderInterviwedPerson(Gender genderInterviwedPerson) {
		this.genderInterviwedPerson = genderInterviwedPerson;
	}

	public String getHouseHoldId() {
		return houseHoldId;
	}

	public void setHouseHoldId(String houseHoldId) {
		this.houseHoldId = houseHoldId;
	}

	public SprayStatus getSprayStatus() {
		return sprayStatus;
	}

	public void setSprayStatus(SprayStatus sprayStatus) {
		this.sprayStatus = sprayStatus;
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

	
	public ReasonNotSprayed getReasonNotSprayed() {
		return reasonNotSprayed;
	}

	public void setReasonNotSprayed(ReasonNotSprayed reasonNotSprayed) {
		this.reasonNotSprayed = reasonNotSprayed;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	

	public SprayTotals getSprayTotals() {
		return sprayTotals;
	}

	public void setSprayTotals(SprayTotals sprayTotals) {
		this.sprayTotals = sprayTotals;
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

	
		
	public String getStudyCode() {
		return studyCode;
	}

	public void setStudyCode(String studyCode) {
		this.studyCode = studyCode;
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
		SprayDetails other = (SprayDetails) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
