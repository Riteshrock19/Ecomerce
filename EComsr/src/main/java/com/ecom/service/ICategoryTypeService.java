package com.ecom.service;

import java.util.List;
import java.util.Map;

import com.ecom.model.CategoryType;

public interface ICategoryTypeService {
  Long saveCategoryType(CategoryType categoryType);
  void updateCategoryType(CategoryType categoryType);
  void deleteCategoryType(Long id);
  List<CategoryType> getAllCategoryType();
  CategoryType getOneCategoryType(Long id);
  Map<Integer,String> getCategoryTypeIdAndName();
}
