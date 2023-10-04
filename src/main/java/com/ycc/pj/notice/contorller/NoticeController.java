package com.ycc.pj.notice.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ycc.pj.notice.model.service.NoticeService;

@Controller
@RequestMapping("/notice/")
public class NoticeController {

	
	private NoticeService service;
	
	@Autowired
	public NoticeController(NoticeService service) {
		super();
		this.service = service;
	}
	
	@RequestMapping("notice.do")
	public String noticeMain() {
		return "/notice/notice";
	}
	
	
}
