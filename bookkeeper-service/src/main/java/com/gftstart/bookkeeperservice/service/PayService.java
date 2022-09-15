package com.gftstart.bookkeeperservice.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.gftstart.bookkeeperservice.VO.ResponseTemplateVO;
import com.gftstart.bookkeeperservice.VO.User;
import com.gftstart.bookkeeperservice.model.Pay;
import com.gftstart.bookkeeperservice.repository.PayRepository;

@Service
public class PayService {

	@Autowired
	private PayRepository payRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public Pay savePay(Pay pay) {
		return payRepository.save(pay);
	}

	public ResponseTemplateVO getPayWithUser(UUID uuidPay) {
		
		Optional<Pay> pay = payRepository.findById(uuidPay);
		
		
		ResponseTemplateVO vo = new ResponseTemplateVO();

		
		ResponseEntity<User> user = restTemplate.getForEntity("http://PERSON-SERVICE/user/" + pay.get().getUuidPersonPay(), User.class);
		
	
		
		vo.setPay(pay.get());
		vo.setUser(user.getBody());
		
		return vo;
	}
	
	
}
