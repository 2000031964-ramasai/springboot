package com.sdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class AddController {


	
	@Autowired
	private AWSS3Service awsS3Service;
	
	@RequestMapping("/home")
	public String home()
	{
		return "upload.jsp";
	}

	@ResponseBody
	@PostMapping("/upload")
	public ModelAndView uploadFile(@RequestParam("file") MultipartFile file,@RequestParam("uname") String uname) {
		ModelAndView mv = new ModelAndView();
		
		awsS3Service.uploadFile(file,uname);
		mv.setViewName("success.jsp");
		return mv;
	}
	

}
