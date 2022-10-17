package com.exp.services;

import java.util.List;

import com.exp.demo1.entity.ChuyenBay;

public interface ChuyenBayService {
	List<ChuyenBay> getAll();
	ChuyenBay getById(String id);
	ChuyenBay create(ChuyenBay cb);
	ChuyenBay update(ChuyenBay cb);
	
}
