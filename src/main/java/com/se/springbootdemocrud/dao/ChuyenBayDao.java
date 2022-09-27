package com.se.springbootdemocrud.dao;

import java.util.List;

import com.se.springbootdemocrud.entity.ChuyenBay;

public interface ChuyenBayDao {

	List<ChuyenBay> getDsChuyenBay();

	ChuyenBay getChuyenBayById(String id);

	ChuyenBay createChuyenBay(ChuyenBay chuyenBay);

}
