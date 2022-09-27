package com.se.springbootdemocrud.responsitory;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.se.springbootdemocrud.entity.ChuyenBay;


@Repository
public interface ChuyenBayResponsitory extends JpaRepository<ChuyenBay, String>{

	public Optional<ChuyenBay> findById(String id);
}
