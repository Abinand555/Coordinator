package com.faith.app.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import com.faith.app.model.CoordinatorModel;


//Repository Interface
public interface ICoordinatorRepository extends JpaRepositoryImplementation<CoordinatorModel,Integer> {

	
}
