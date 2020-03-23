package com.faith.app.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.repository.ICoordinatorRepository;
import com.faith.app.model.CoordinatorModel;


@Service
public class CoordinatorServiceImplementation implements ICoordinatorService {
    
	//instance for interface ICoordinatorRepository
	@Autowired
	private ICoordinatorRepository coordinatorRepo;

	//add Co-ordinator
	@Transactional
	@Override
	public CoordinatorModel addCoordinator(CoordinatorModel coordinator) {

		return coordinatorRepo.save(coordinator);
	}

	
	//list coordinator
	@Override
	public List<CoordinatorModel> listCoordinator() {
		
		return coordinatorRepo.findAll();
	}
}
	