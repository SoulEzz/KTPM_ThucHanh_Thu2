package com.exp.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exp.demo1.entity.ChuyenBay;

@Repository
@Transactional
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
	
	ChuyenBay findMaCB(String maCB);
	List<ChuyenBay> findCBGaDen(String gaDen);
	
	
}
