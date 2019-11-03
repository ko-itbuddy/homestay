package com.homestay.korea.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.homestay.korea.DAO.IPlaceDAO;
import com.homestay.korea.DTO.PlaceDTO;
import com.homestay.korea.config.RootConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {RootConfig.class})
public class PlaceDAOTests {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private IPlaceDAO palceDAO;
	
	//test 마무리
	//@Test
	//public void testReadPlace() {
	//	List<PlaceDTO> place = palceDAO.readWithThemeLocationLimitDesc("쇼핑", "경기", 5);
	//	
	//	for(PlaceDTO pl :  place) {
	//		logger.info(pl.toString());
	//	}
		
	//}
	
}












