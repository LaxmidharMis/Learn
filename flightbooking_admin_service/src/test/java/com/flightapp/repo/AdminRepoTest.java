package com.flightapp.repo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.flightapp.entity.Admin;
import com.flightapp.repository.AdminRepo;

@SpringBootTest
public class AdminRepoTest {
	
	@Autowired
	private AdminRepo adminRepo;
	
	
	@Test
	void testFindByUserName() {
		Admin admin=new Admin(24L,"admin1","admin1");
		//adminRepo.save(admin);
		Admin result = adminRepo.findByUserName("admin1");
		assertThat(admin.getUserName()).isEqualTo(result.getUserName());
	}

}
