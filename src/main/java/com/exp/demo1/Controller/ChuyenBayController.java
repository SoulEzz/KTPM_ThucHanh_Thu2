package com.exp.demo1.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exp.demo1.entity.ChuyenBay;
import com.exp.services.ChuyenBayService;

@RestController
@RequestMapping("/")
public class ChuyenBayController {
	
	private final ChuyenBayService chuyenBayService;
	
	public ChuyenBayController(ChuyenBayService chuyenBayService) {
		this.chuyenBayService = chuyenBayService;
	}
	
	@GetMapping("/DS_ChuyenBay")
	public List<ChuyenBay> getAll() {
		return chuyenBayService.getAll();
	}
	
	
	
}
