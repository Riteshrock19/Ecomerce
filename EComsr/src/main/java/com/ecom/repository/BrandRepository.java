package com.ecom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecom.model.Brand;

public interface BrandRepository extends JpaRepository<Brand, Long> {
     @Query("SELECT id,name FROM Brand")
	List<Object[]> getBrandIdAndName();
}
