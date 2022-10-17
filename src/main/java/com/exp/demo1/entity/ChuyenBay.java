package com.exp.demo1.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "chuyenbay")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChuyenBay {
	
	@Id
	private String maCB;
	private String gaDi;
	private String gaDen;
	private String doDai;
	private String gioDi;
	private String gioDen;
	private int chiPhi;
	
	
}
