package com.ycc.pj.notice.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycc.pj.notice.model.mapper.NoticeMapper;

@Service
public class NoticeServiceImpl implements NoticeService {

	private NoticeMapper mapper;
	
	@Autowired
	public NoticeServiceImpl(NoticeMapper mapper) {
		super();
		this.mapper = mapper;
	}
	
}
