package com.homestay.korea.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.homestay.korea.DTO.PlaceDetailDataDTO;

public class PlaceDetailDateDAO implements IPlaceDetailDateDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private static final String Namespace = "com.homestay.korea.DAO.IPlaceDetailDateDAO";
	
	//메인화면에서 관광지 클릭 시, 상세페이지로 넘어가며 보여질 관광지 정보
	@Override
	public List<PlaceDetailDataDTO> readWithPlaceDetailDate(PlaceDetailDataDTO vo) {
		
		return sqlSession.selectList(Namespace+".readWithPlaceDetailDate", vo);
	}
}
