package com.se.springbootdemocrud.entity;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@IdClass(ChungNhanPK.class)
@Table(name = "chungnhan")
public class ChungNhan implements Serializable {
	@Id
	@ManyToOne
	@JoinColumn(name = "MaNV")
	private NhanVien nhanVien;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "MaMB")
	private MayBay mayBay;

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public MayBay getMayBay() {
		return mayBay;
	}

	public void setMayBay(MayBay mayBay) {
		this.mayBay = mayBay;
	}

	public ChungNhan(NhanVien nhanVien, MayBay mayBay) {
		super();
		this.nhanVien = nhanVien;
		this.mayBay = mayBay;
	}

	public ChungNhan() {
		super();
	}

	@Override
	public String toString() {
		return "ChungNhan [nhanVien=" + nhanVien + ", mayBay=" + mayBay + "]";
	}
	
	
	
}
