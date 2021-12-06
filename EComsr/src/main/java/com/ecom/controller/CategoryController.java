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

import com.ecom.model.Category;
import com.ecom.service.ICategoryService;
import com.ecom.service.ICategoryTypeService;

@Controller
@RequestMapping("/category")
public class CategoryController {
	@Autowired
   private ICategoryService service;
	
	@Autowired
	private ICategoryTypeService categoryTypeService;
	
	private void commonUi(Model model) {
		model.addAttribute("categoryTypes", categoryTypeService.getCategoryTypeIdAndName());
	}
	
	@GetMapping("/register")
	public String registerCategory(Model model) {
		model.addAttribute("category", new Category());
		return "CategoryRegister";
	}
	
	
	@PostMapping("/save")
	public String saveCategory(@ModelAttribute Category category, Model model) {
		java.lang.Long id=service.saveCategory(category);
		model.addAttribute("messege","Category Created with ID:" +id);
		model.addAttribute("category", new Category());
		return "CategoryRegister";
	}
	
	@GetMapping("/all")
	public String getAllCategorys(Model model, @RequestParam(value = "message", required = false) String message) {
		List<Category> list=service.getAllCategory();
		model.addAttribute("list",list);
		model.addAttribute("message", message);
		return "CategoryData";
	}
	
	@GetMapping("/delete")
	public String deleteCategory(@RequestParam Long id, RedirectAttributes attributes) {
		try {
			service.deleteCategory(id);
			attributes.addAttribute("message", "Category Deleted with ID:" +id);
			
		}catch(Exception e) {
			e.printStackTrace();
			attributes.addAttribute("message", e.getMessage());
		}
		return "redirect:all";
	}
	
	@GetMapping("/edit")
	public String editCategory(@RequestParam Long id, Model model, RedirectAttributes attributes) {
		String page = null;
		try {
			Category ob=service.getOneCategory(id);
			model.addAttribute("category", ob);
			page = "CategoryEdit";
			
		}catch (Exception e) {
			e.printStackTrace();
			attributes.addAttribute("message", e.getMessage());
			page = "redirect:all";
		}
		return page;
	}
	@PostMapping("/update")
	public String updateCategory(@ModelAttribute Category category, RedirectAttributes attributes) {
		service.updateCategory(category);
		attributes.addAttribute("message", "Category updated");
		return "redirect:all";
	}
}
