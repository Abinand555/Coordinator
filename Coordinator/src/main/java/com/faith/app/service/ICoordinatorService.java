package com.faith.app.service;

import java.util.List;

import com.faith.app.model.CoordinatorModel;


//Interface
public interface ICoordinatorService {

	//method decleration to add coordinator
	public CoordinatorModel addCoordinator(CoordinatorModel qual);

	//method decleration to list coordinator
	public List<CoordinatorModel> listCoordinator();

	

}
