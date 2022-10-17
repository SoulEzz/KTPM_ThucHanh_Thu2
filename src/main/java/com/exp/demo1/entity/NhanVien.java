package com.exp.demo1.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "nhanvien")
@Data
public class NhanVien {
	
	private String maNV;
	private String ten;
	private int luong;
	
	@ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	@JoinTable(name = "chungnhan", joinColumns = {@JoinColumn(name = "maNV")},
    inverseJoinColumns = {@JoinColumn(name = "maMB")})
	private List<MayBay> mayBays;
	
}
