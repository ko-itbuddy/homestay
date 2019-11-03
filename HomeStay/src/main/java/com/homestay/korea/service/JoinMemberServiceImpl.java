package com.homestay.korea.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homestay.korea.DAO.IMemberDAO;
import com.homestay.korea.DTO.MemberDTO;


@Service
public class JoinMemberServiceImpl implements IJoinMemberService{

	@Autowired
	private IMemberDAO dao;
	
	private SqlSessionTemplate joinSqlSession;
	
//	public int insertMember(MemberDTO dto) {
//		// TODO Auto-generated method stub
//		int resultCnt = 0;
//		dao = joinSqlSession.getMapper(IMemberDAO.class);
//		try {
//			resultCnt = dao.memberInsert(dto);
//		}catch (Exception e) {
//			// TODO: handle exception
//		}
//		return resultCnt;
//		
//	}
	
	public boolean insertMember(MemberDTO dto) {
		dao.memberInsert(dto);
		return true;
	}
	
	


//	@Override
//	public void insertMemmber_theme(Theme_prefer prefer) {
//		// TODO Auto-generated method stub
//		
//	}
	

	
}