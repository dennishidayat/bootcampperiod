package com.enigma.task.bootcamp.dao;

import java.util.List;

import com.enigma.task.bootcamp.exception.CustomExecption;
import com.enigma.task.bootcamp.model.BootcampPeriod;


public interface BootcampPeriodDao {
	public BootcampPeriod getById(int id) throws CustomExecption;
	public BootcampPeriod save(BootcampPeriod bootcampPeriod) throws CustomExecption;
	void delete(BootcampPeriod bootcampPeriod) throws CustomExecption;

	List<BootcampPeriod> getList() throws CustomExecption;
	List<BootcampPeriod> getListByActiveFlag() throws CustomExecption;
}
