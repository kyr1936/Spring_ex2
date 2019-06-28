package com.yr.notice;

public class NoticeService {
	
	private NoticeDAO noticeDAO;
	
	public NoticeService() {
		noticeDAO = new NoticeDAO(); 	
		//의존성 주입 Dependency Injection, DI   *Spring의 핵심 
		//IOC(Inversion of Control, 제어의 역전)					
	}
	
	public int insert() throws Exception{
		noticeDAO.insert();
		
		return 0;
	}
}
