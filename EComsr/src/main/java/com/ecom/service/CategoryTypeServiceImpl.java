package com.ecom.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecom.model.CategoryType;
import com.ecom.repository.CategoryTypeRepository;
import com.ecom.util.AppUtil;
@Service
public class CategoryTypeServiceImpl implements ICategoryTypeService {
    @Autowired
	private CategoryTypeRepository repo;
    
	@Override
	@Transactional
	public Long saveCategoryType(CategoryType categoryType) {
		
		return repo.save(categoryType).getId();
	}

	@Override
	@Transactional
	public void updateCategoryType(CategoryType categoryType) {
		repo.save(categoryType);

	}

	

	@Override
	@Transactional(
			readOnly = true
			)
	public List<CategoryType> getAllCategoryType() {
		
		return repo.findAll();
	}

	@Override
	@Transactional(
			readOnly = true
			)
	public CategoryType getOneCategoryType(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public Map<Integer, String> getCategoryTypeIdAndName() {
		List<Object[]> list=repo.getCategoryTypeIdAndName();
		return AppUtil.convertListToMap(list);
	}

	@Override
	public void deleteCategoryType(Long id) {
		repo.deleteById(id);
		
	}

}
