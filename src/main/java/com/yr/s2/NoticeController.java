package com.yr.s2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yr.notice.NoticeService;

@RequestMapping(value="/notice/**")
@Controller
public class NoticeController {
	
	private NoticeService noticeService;
	
	public NoticeController() {
		// TODO Auto-generated constructor stub
		noticeService = new NoticeService();
	}
	
	
	@RequestMapping(value="noticeList", method=RequestMethod.GET )
	public String noticeList() {
		
		return "noticeList";
	}
	
	public String noticeSelect() {
		return "";
	
	}
	
	public String noticeWrite() {
		return "";
	}
	public String noticeUpdate() {
		return "";
	}
	
	public String noticeDelete() {
		return "";
	}
	
}
