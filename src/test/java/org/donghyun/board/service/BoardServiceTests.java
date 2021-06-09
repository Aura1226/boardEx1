package org.donghyun.board.service;

import org.donghyun.board.config.BoardConfig;
import org.donghyun.board.domain.Board;
import org.donghyun.board.dto.BoardDTO;
import org.donghyun.board.service.BoardService;
import org.donghyun.common.CommonConfig;
import org.donghyun.common.dto.PageDTO;
import org.donghyun.time.config.TimeConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CommonConfig.class , TimeConfig.class , BoardConfig.class})
@Log4j
public class BoardServiceTests {

	@Autowired
	private BoardService service;
	
	@Test
	public void testGetList() {
		PageDTO pageDTO = PageDTO.builder().page(10).perSheet(10).type("t").keyword("10").build();
		log.info(service);
		log.info(service.getList(pageDTO));
	}
	
	@Test
	public void testGetTotalCount() {
		PageDTO pageDTO = PageDTO.builder().page(10).perSheet(10).type("t").keyword("10").build();
		log.info(service.getTotalCount(pageDTO));
	}
	
	@Test
	public void testSelectOne() {
		log.info(service.selectOne(3));
	}
	
	@Test
	public void testInsert() {
		BoardDTO boardDTO = BoardDTO.builder().title("serviceTest").content("serviceTest").writer("serviceTest").build();
		service.insert(boardDTO);
	}
	
	@Test
	public void testDelete() {
		service.delete(2038);
	}
	
	@Test
	public void testUpdate() {
		BoardDTO boardDTO = BoardDTO.builder().bno(1518)
				 .title("updateService")
				 .content("updateService")
				 .writer("updateService")
				 .build();
		
		service.update(boardDTO);
	}
	
}
