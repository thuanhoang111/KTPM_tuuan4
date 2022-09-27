package com.se.springbootdemocrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.se.springbootdemocrud.entity.ChuyenBay;
import com.se.springbootdemocrud.responsitory.ChuyenBayResponsitory;

@Service
public class ChuyenBayDaoImpl implements ChuyenBayDao {

	@Autowired
	private ChuyenBayResponsitory chuyenBayResponsitory;

	public ChuyenBayDaoImpl(ChuyenBayResponsitory chuyenBayResponsitory) {
		super();
		this.chuyenBayResponsitory = chuyenBayResponsitory;
	}
	
	@Override
	public List<ChuyenBay> getDsChuyenBay() {
		List<ChuyenBay> listChuyenBay = chuyenBayResponsitory.findAll();
		return listChuyenBay;
	}
	@Override
	public ChuyenBay getChuyenBayById(String id) {
		ChuyenBay chuyenBay = chuyenBayResponsitory.findById(id).orElse(null);
		return chuyenBay;
	}
	 @Override
	public ChuyenBay createChuyenBay(ChuyenBay chuyenBay) {
		 System.out.println(chuyenBay);
		
		 chuyenBayResponsitory.save(chuyenBay);
		 
		 return chuyenBay;
	}
}
