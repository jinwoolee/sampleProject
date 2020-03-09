package dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import vo.BusVo;

public class BusDaoTest {

	//TDD : Test Driven Development
	
	@Test
	public void busListTest() {
		//given
		BusDao busDao = new BusDao();
		
		//when
		List<BusVo> busList = busDao.busList();

		//then
		assertNotNull(busList);
	}

}
