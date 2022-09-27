package com.se.springbootdemocrud.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.springbootdemocrud.dao.ChuyenBayDao;
import com.se.springbootdemocrud.entity.ChuyenBay;

@RestController
@RequestMapping("")
public class ChuyenBayController {
	@Autowired
	private ChuyenBayDao chuyenBayDao;

	
	@GetMapping("/chuyenbay")
	public List<ChuyenBay> findAll(){
		return chuyenBayDao.getDsChuyenBay();
	}
	@GetMapping("/chuyenbay/{ChuyenBayId}")
	public ChuyenBay findById(@PathVariable String ChuyenBayId) {
		return chuyenBayDao.getChuyenBayById(ChuyenBayId);
	}
	@PostMapping("/chuyenbay")
	public ChuyenBay createChuyenBay(@RequestBody ChuyenBay chuyenBay) {
		System.out.println(chuyenBay);
		return chuyenBayDao.createChuyenBay(chuyenBay);
	}
}
