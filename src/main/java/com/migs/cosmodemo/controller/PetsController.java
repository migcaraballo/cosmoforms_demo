package com.migs.cosmodemo.controller;

import com.google.gson.Gson;
import com.migs.cosmodemo.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by migc on 5/24/17.
 */

@Controller
@RequestMapping("pets")
public class PetsController {

	@Autowired
	private Dao petsDao;

    @Autowired
    private Gson gs;

	private static final String PETS = "pets";
	private static final String EDIT_PET = "editpet";
	private static final String ADD_PET = "addpet";

	@RequestMapping
	public String viewpets(Model model){
		List<Map<String, Object>> petsList = petsDao.findAll();
		model.addAttribute("petsList", petsList);
		return PETS;
	}

	@RequestMapping("/edit/{pid}")
	public String editPet(Model model, @PathVariable String pid){
        model.addAttribute("pid", pid);
        return EDIT_PET;
    }

    @RequestMapping("/addpet")
    public String addPetForm(Model model){
		return ADD_PET;
	}
}
