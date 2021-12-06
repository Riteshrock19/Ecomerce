package com.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ecom.exception.CategoryTypeNotFoundException;
import com.ecom.model.CategoryType;
import com.ecom.service.ICategoryTypeService;
@Controller
@RequestMapping("/categoryType")
public class CategoryTypeController {
   @Autowired
   private ICategoryTypeService service;
   
   @GetMapping("/register")
   public String registerCategoryType(Model model) {
	   model.addAttribute("categorytype", new CategoryType());
	   return "CategoryTypeRegister";
   }
   
   @PostMapping("/save")
   public String saveCategoryType(@ModelAttribute CategoryType categoryType, Model model) {
	   java.lang.Long id=service.saveCategoryType(categoryType);
	   model.addAttribute("message", "CategoryType Created with ID"+id);
	   model.addAttribute("categorytype", new CategoryType());
	   return "CategoryTypeRegister";
	   
   }
   
   @GetMapping("/all")
   public String getAllCategoryTypes(@RequestParam(value="messege",required=false) String message, Model model) {
	   List<CategoryType> list=service.getAllCategoryType();
	   model.addAttribute("list", list);
	   model.addAttribute("message", message);
	   return "CategoryTypeData";
   }
   
   @GetMapping("/delete")
   public String deleteCategoryType(@RequestParam Long id,RedirectAttributes attributes) {
	   try {
		   service.deleteCategoryType(id);
		   attributes.addAttribute("message", "CategoryType deleted with Id" +id);
	   }catch(CategoryTypeNotFoundException e) {
		   e.printStackTrace();
		   attributes.addAttribute("message", e.getMessage());
	   }
	   return "redirect:all";
   }
   
   @GetMapping("/edit")
   public String editCategoryType(@RequestParam Long id,Model model,RedirectAttributes attributes) {
	   String page=null;
	   try {
		   CategoryType ob=service.getOneCategoryType(id);
		   model.addAttribute("categorytype", ob);
		   page="CategoryTypeEdit";
	   }catch(CategoryTypeNotFoundException e) {
		   e.printStackTrace();
		   attributes.addAttribute("message", e.getMessage());
		   page="redirect:all";
	   }
	   return page;
   }
   
   @PostMapping("/update")
   public String updateCategoryType(@ModelAttribute CategoryType categoryType,RedirectAttributes attributes) {
	   service.updateCategoryType(categoryType);
	   attributes.addAttribute("message","CategoryType updated");
	   return "redirect:all";
			   
   }
}
