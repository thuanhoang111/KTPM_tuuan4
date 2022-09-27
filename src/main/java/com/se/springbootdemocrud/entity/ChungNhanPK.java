package com.se.springbootdemocrud.entity;
import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ChungNhanPK implements Serializable{
	
	private String nhanVien;
	private int mayBay;
	public String getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(String nhanVien) {
		this.nhanVien = nhanVien;
	}
	public int getMayBay() {
		return mayBay;
	}
	public void setMayBay(int mayBay) {
		this.mayBay = mayBay;
	}
	public ChungNhanPK(String nhanVien, int mayBay) {
		super();
		this.nhanVien = nhanVien;
		this.mayBay = mayBay;
	}
	@Override
	public String toString() {
		return "ChungNhanPK [nhanVien=" + nhanVien + ", mayBay=" + mayBay + "]";
	}
	
	
	
}
