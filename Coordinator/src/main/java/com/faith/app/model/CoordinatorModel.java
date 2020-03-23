package com.faith.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="coordinator") 

public class CoordinatorModel {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	
    //local decleration
	private int coordinatorId;
	private String coordinatorName;
	
	
	//Getters and Setters
	public int getCoordinatorId() {
		return coordinatorId;
	}
	public void setCoordinatorId(int coordinatorId) {
		this.coordinatorId = coordinatorId;
	}
	public String getCoordinatorName() {
		return coordinatorName;
	}
	public void setCoordinatorName(String coordinatorName) {
		this.coordinatorName = coordinatorName;
	}
	
	
	//ToString
	@Override
	public String toString() {
		return "CoordinatorModel [coordinatorId=" + coordinatorId + ", coordinatorName=" + coordinatorName + "]";
	}
	
	
	
	

}
