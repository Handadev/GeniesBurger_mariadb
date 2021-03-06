package com.myweb.ctrl;


import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myweb.domain.StockOrderVO;
import com.myweb.domain.StockVO;
import com.myweb.persistence.stock_order.StockOrderDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class StockOrderDummyTest {
	private static Logger logger = LoggerFactory.getLogger(StockOrderDummyTest.class);
	
	@Inject
	private StockOrderDAO sodao;
	
	@Test
	public void stockOrderTest() {
		for (int i = 1; i < 101; i++) {
		StockOrderVO sovo = new StockOrderVO();
		sovo.setSname("재고" + i);;
		sovo.setOrder_qty(50);
		sodao.insert(sovo);
		}
	}
	
//	@Test
//	public void stockOrderTest() {
//		StockOrderVO sovo = new StockOrderVO();
//		sovo.setSname("치즈");
//		sovo.setOrder_qty(50);
//	    sodao.insert(sovo);
//	}
}
