package com.exp.demo1.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name ="maybay")
@Data
public class MayBay {
		
	private String maMB;
	private String loai;
	private String tamBay;
	@ManyToMany(mappedBy = "mayBays", fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private List<NhanVien> nhanVien;
	
}
