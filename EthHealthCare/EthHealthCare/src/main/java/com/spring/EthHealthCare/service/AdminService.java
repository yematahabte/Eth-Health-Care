package com.spring.EthHealthCare.service;

import java.util.List;
import com.spring.EthHealthCare.entity.Admin;


public interface AdminService {


	public List<Admin> findByRole(String user);

	public Admin findByEmail(String user);
	
	public List<Admin> findAll();

	public void save(Admin admin);
	
}
