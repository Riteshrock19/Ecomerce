package com.ecom.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.Brand;
import com.ecom.repository.BrandRepository;
import com.ecom.service.IBrandService;
import com.ecom.util.AppUtil;
@Service
public class BrandServiceImpl implements IBrandService {
    @Autowired
	private BrandRepository repo;
    
	@Override
	public Long saveBrand(Brand b) {
		// TODO Auto-generated method stub
		return repo.save(b).getId();
	}

	@Override
	public void updateBrand(Brand b) {
		repo.save(b);

	}

	@Override
	public void deleteBrand(Long id) {
		repo.deleteById(id);

	}

	@Override
	public Brand getOneBrand(Long id) {
		Optional<Brand> opt=repo.findById(id);
		if(opt.isPresent())
			return opt.get();
		return null;
	}

	@Override
	public List<Brand> getAllBrands() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Map<Long, String> getBrandIdAndName() {
		List<Object[]> list=repo.getBrandIdAndName();
		return AppUtil.convertListToMapLong(list);
	}

}
