package com.flightapp.service;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.flightapp.entity.Admin;
import com.flightapp.repository.AdminRepo;

@SpringBootTest
public class AdminServiceTest {
	
	@Mock
	private AdminRepo adminRepo; 
	
	private AdminServiceImpl adminService;

	@BeforeEach
	void setUp() {
	   this.adminService=new AdminServiceImpl(this.adminRepo);
	}
	
	@Test
	void testSaveAdmin() {
		Admin admin=new Admin("admin1","admin1");
		adminRepo.save(admin);
		verify(adminRepo).save(admin);
	}
}
