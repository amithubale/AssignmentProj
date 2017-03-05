 package com.ami.org.Control.RegistrationInsertControl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ami.org.Dto.Registration.RegistrationDto;
import com.ami.org.model.Service.RegistrationService.RegistrationService;
import com.ami.org.util.Constructor;
import org.springframework.mail.javamail.MimeMessageHelper;
@Controller
public class RegisterInsertControl {
	@Autowired
	private RegistrationService service;
	public RegisterInsertControl() {
		Constructor.message(this.getClass());
	}
	@RequestMapping(value="/registraion.do")
	public  ModelAndView registraionControl(@ModelAttribute RegistrationDto dto)
	{  
		System.out.println("inside registrion control");
		RegistrationDto db=service.SaveService(dto);
		if(db!=null)
		{
			System.out.println("register controler return");
			return new ModelAndView("/Success.jsp");
			
		}
		else
		{
			return new ModelAndView( "/Registration.jsp");
		}


	}

}
