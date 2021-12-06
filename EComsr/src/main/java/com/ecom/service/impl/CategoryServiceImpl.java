package com.ecom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecom.model.Category;
import com.ecom.repository.CategoryRepository;
import com.ecom.service.ICategoryService;
@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
	private CategoryRepository repo;
	
	@Override
	@Transactional
	public Long saveCategory(Category category) {
		return repo.save(category).getId();
		
	}

	@Override
	@Transactional
	public void updateCategory(Category category) {
		repo.save(category);

	}

	@Override
	@Transactional
	public void deleteCategory(Long id) {
		repo.deleteById(id);

	}

	@Override
	@Transactional(readOnly = true)
	public List<Category> getAllCategory() {
		
		return repo.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Category getOneCategory(Long id) {
		
		return repo.getById(id);
	}

}
