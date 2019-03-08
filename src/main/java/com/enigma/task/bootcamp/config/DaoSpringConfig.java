package com.enigma.task.bootcamp.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.enigma.task.bootcamp.dao.BootcampPeriodDao;
import com.enigma.task.bootcamp.dao.impl.BootcampPeriodDaoImpl;

@Configuration
public class DaoSpringConfig {
	
	@Bean
	public BootcampPeriodDao bootcampPeriodDao() {
		return new BootcampPeriodDaoImpl();
	}
	
	@Bean
    public ModelMapper modelMapper() {
    	return new ModelMapper();
    }

}
