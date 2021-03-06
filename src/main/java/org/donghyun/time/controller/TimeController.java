package org.donghyun.time.controller;

import org.donghyun.time.service.TimeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/time")
@Log4j
@RequiredArgsConstructor
public class TimeController {

	private final TimeService service;
	
	@GetMapping("/now")
	public void getNow(Model model) {
		log.info(service.getNow());
		model.addAttribute("time" , service.getNow());
	}
	
}
