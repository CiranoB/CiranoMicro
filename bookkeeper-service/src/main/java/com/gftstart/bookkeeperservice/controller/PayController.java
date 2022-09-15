package com.gftstart.bookkeeperservice.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gftstart.bookkeeperservice.VO.ResponseTemplateVO;
import com.gftstart.bookkeeperservice.model.Pay;
import com.gftstart.bookkeeperservice.repository.PayRepository;
import com.gftstart.bookkeeperservice.service.PayService;

@RestController
@CrossOrigin("*")
@RequestMapping("/pay")
public class PayController {
	
	@Autowired
	private PayService payService;
	
	@Autowired
	private PayRepository payRepository;
	
	@PostMapping("/")
	public Pay savePay(@RequestBody Pay pay) {
		return payService.savePay(pay);
	}

	@GetMapping("/all")
	public ResponseEntity<List<Pay>> getAll(){
		return ResponseEntity.ok(payRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseTemplateVO getPayWithUser(@PathVariable("id") UUID uuidPay) {
		return payService.getPayWithUser(uuidPay);
		
	}
	
}
