package com.ami.org.Control.RegistraionviewControler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ami.org.Dto.Registration.RegistrationDto;
import com.ami.org.model.Service.RegistraionViewService.Registaionviewservice;
import com.ami.org.util.Constructor;

@Controller
@RequestMapping("/")
public class RegistrationviewControl {
	@Autowired
	private Registaionviewservice service;
	public RegistrationviewControl() {
		Constructor.message(this.getClass());
	}
	@RequestMapping(value="update.do",method=RequestMethod.POST)
	public ModelAndView updateControler(@ModelAttribute RegistrationDto dto,HttpServletRequest req)
	{
		System.out.println("starting updatecontroler....");
		HttpSession session=req.getSession(false);
		RegistrationDto dtofromscope=(RegistrationDto)session.getAttribute("dto");
		dto.setId(dtofromscope.getid());
		RegistrationDto dtofromdb=service.updateDetailsService(dto);
		System.out.println("exiting update controler");

		session.setAttribute("dto",dtofromdb); 
		return new ModelAndView("home.jsp","msg","update details successfully...");

	}
}



