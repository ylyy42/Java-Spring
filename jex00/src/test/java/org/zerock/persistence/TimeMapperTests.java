package org.zerock.persistence;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.zerock.mapper.TimeMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@ContextConfiguration(classes = { org.zerock.config.RootConfig.class})
@Log4j
public class TimeMapperTests {
	
	@Setter(onMethod_ =@Autowired)
	private TimeMapper timeMapper;
	
	@Test
	public void testGetTime() {
		log.info(timeMapper.getClass().getName());
		log.info(timeMapper.getTime());
	}
	
	@Test
	public void testGetTime2() {
		log.info("getTime2");
		log.info(timeMapper.getTime2());
	}
}
