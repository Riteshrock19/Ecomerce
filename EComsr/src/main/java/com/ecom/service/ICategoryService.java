package com.ecom.service;

import java.util.List;

import com.ecom.model.Category;



public interface ICategoryService {
   Long saveCategory(Category category);
   void updateCategory(Category category);
   void deleteCategory(Long id);
   List<Category> getAllCategory();
   Category getOneCategory(Long id);
   
}
