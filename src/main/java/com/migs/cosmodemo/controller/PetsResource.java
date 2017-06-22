package com.migs.cosmodemo.controller;

import com.migs.cosmodemo.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by migc on 5/13/17.
 */

@RestController
@RequestMapping("pet-res")
public class PetsResource {

	@Autowired
	private Dao petsDao;

	private static final String FORM_ERRORS = "form_errors";

	@RequestMapping(value = "/get/{pid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, Object> retrievePetById(@PathVariable String pid){
		Map<String, Object> petDoc = petsDao.findById(pid);
		return petDoc;
	}

	@RequestMapping(value = "/updatepet")
	public ResponseEntity<Map<String, Object>> updatePet(@RequestBody Map<String, Object> formObject){
		formObject = validateFormErrors(formObject);

		if(formObject.get(FORM_ERRORS) != null){
			return new ResponseEntity<>(formObject, HttpStatus.BAD_REQUEST);
		}
		else{
			// update first, if exception thrown return error and bad request
			boolean updated = petsDao.updateDoc((String)formObject.get("_id"), formObject);

			if(!updated){
				formObject.put(FORM_ERRORS, "Error Ocurred during update.");
				return new ResponseEntity<>(formObject, HttpStatus.BAD_REQUEST);
			}

			return new ResponseEntity<>(formObject, HttpStatus.OK);
		}
	}

	@RequestMapping(value = "/createpet", method = RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> createPet(@RequestBody Map<String, Object> formObj){
		formObj = validateFormErrors(formObj);

		if(formObj.get(FORM_ERRORS) != null){
			return new ResponseEntity<>(formObj, HttpStatus.BAD_REQUEST);
		}
		else{
			boolean created = petsDao.insertDoc(formObj);

			if(!created){
				formObj.put(FORM_ERRORS, "Error occured while trying to create pet");
				return new ResponseEntity<>(formObj, HttpStatus.BAD_REQUEST);
			}

			return new ResponseEntity<>(formObj, HttpStatus.OK);
		}
	}

	@RequestMapping(value = "/emptypet")
	public Map<String, Object> getEmptyPet(){
		Map<String, Object> emptyPet = new HashMap<>();
		emptyPet.put("nombre", "");
		emptyPet.put("age", 0);
		return emptyPet;
	}

	private Map<String, Object> validateFormErrors(Map<String, Object> formObj){
		List<String> errorsList = new ArrayList<>();

		String name = (String)formObj.get("nombre");
		if(name == null || name.isEmpty()){
			errorsList.add("Nombre can not be empty");
		}

		Number age = (Number)formObj.get("age");
		if(age == null || age.intValue() == 0){
			errorsList.add("Age can not be empty or 0");
		}

		if(!errorsList.isEmpty())
			formObj.put("form_errors", errorsList);

		return formObj;
	}

}
