package com.faith.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.faith.app.model.CoordinatorModel;
import com.faith.app.service.CoordinatorServiceImplementation;


@CrossOrigin
@RestController
@RequestMapping("/")

public class CoordinatorController {    //RestController

	@Autowired
	private CoordinatorServiceImplementation coordinatorService;

	//add co-ordinator
	@PostMapping("/coordinator")
	public ResponseEntity<CoordinatorModel> addQualifications(@RequestBody CoordinatorModel coordinator)
	{
		return new ResponseEntity<CoordinatorModel>(coordinatorService.addCoordinator(coordinator),HttpStatus.OK);

	}
	
	//list coordinator
	@GetMapping("/coordinators")
	public ResponseEntity<List<CoordinatorModel>> getCoordinator() {
		return new ResponseEntity<List<CoordinatorModel>>(coordinatorService.listCoordinator(),HttpStatus.OK);

	}
}
