package com.enigma.task.bootcamp.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;

import com.enigma.task.bootcamp.dao.BootcampPeriodDao;
import com.enigma.task.bootcamp.exception.CustomExecption;
import com.enigma.task.bootcamp.model.BootcampPeriod;
import com.enigma.task.bootcamp.repository.BootcampPeriodRepository;


public class BootcampPeriodDaoImpl extends BaseImpl implements BootcampPeriodDao {
	
	@Autowired
	public BootcampPeriodRepository repository;

	public BootcampPeriod getById(int id) throws CustomExecption {
		return repository.findById(id).orElse(null);
	}

	public BootcampPeriod save(BootcampPeriod bootcampPeriod) throws CustomExecption {
		return repository.save(bootcampPeriod);
	}

	public void delete(BootcampPeriod bootcampPeriod) throws CustomExecption {
		repository.delete(bootcampPeriod);
	}

	public List<BootcampPeriod> getList() throws CustomExecption {
		CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<BootcampPeriod> query = critB.createQuery(BootcampPeriod.class);
		Root<BootcampPeriod> root = query.from(BootcampPeriod.class);
		query.select(root);
		
		TypedQuery<BootcampPeriod> i = em.createQuery(query);
		
		return i.getResultList();
	}

	public List<BootcampPeriod> getListByActiveFlag() throws CustomExecption {
		CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<BootcampPeriod> query = critB.createQuery(BootcampPeriod.class);
		Root<BootcampPeriod> root = query.from(BootcampPeriod.class);
		query = query.select(root)
				.where(critB.equal(root.get("activeFlag"), 1));
		
		TypedQuery<BootcampPeriod> i = em.createQuery(query);
		
		return i.getResultList();
	}

}
