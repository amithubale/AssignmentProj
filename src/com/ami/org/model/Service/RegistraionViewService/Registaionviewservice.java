package com.ami.org.model.Service.RegistraionViewService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ami.org.Dto.Registration.RegistrationDto;
import com.ami.org.model.dao.RegistraionviewDao.RegistraionviewDao;
import com.ami.org.util.Constructor;

@Service
public class Registaionviewservice{
     @Autowired
	private RegistraionviewDao dao;
public Registaionviewservice() {
Constructor.message(this.getClass());
} 
public RegistrationDto updateDetailsService(RegistrationDto dto)
{
System.out.println("starting view service");
RegistrationDto dtofromdb=dao.update(dto);
System.out.println("exiting view service");

return dtofromdb;
}

}

