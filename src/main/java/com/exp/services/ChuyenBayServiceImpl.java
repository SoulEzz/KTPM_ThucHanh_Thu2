package com.exp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.exp.demo1.entity.ChuyenBay;
import com.exp.repository.ChuyenBayRepository;

public class ChuyenBayServiceImpl implements ChuyenBayService {
	
	private final ChuyenBayRepository chuyenBayRepository;
	
	@Autowired
	public ChuyenBayServiceImpl(ChuyenBayRepository chuyenBayRepository) {
		this.chuyenBayRepository = chuyenBayRepository;
	}

	@Override
	public List<ChuyenBay> getAll() {
		
		return chuyenBayRepository.findAll();
		
	}

	@Override
	public ChuyenBay getById(String id) {
		return chuyenBayRepository.findMaCB(id);
	}

	@Override
	public ChuyenBay create(ChuyenBay cb) {
		return chuyenBayRepository.saveAndFlush(cb);
	}

	@Override
	public ChuyenBay update(ChuyenBay cb) {
		return chuyenBayRepository.save(cb);
	}
	
	
	
}
