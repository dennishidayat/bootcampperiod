package com.enigma.task.bootcamp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bootcamp_period")
public class BootcampPeriod {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="batch_id")
	private int batch_id;
	@Column(name="week_id")
	private int week_id;
	@Column(name="description")
	private String description;
	@Column(name="active_flag")
	private Boolean active_flag;
	
	public BootcampPeriod(int id, int batch_id, int week_id, String description, Boolean active_flag) {
		this.id = id;
		this.batch_id = batch_id;
		this.week_id = week_id;
		this.description = description;
		this.active_flag = active_flag;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBatch_id() {
		return batch_id;
	}

	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}

	public int getWeek_id() {
		return week_id;
	}

	public void setWeek_id(int week_id) {
		this.week_id = week_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getActive_flag() {
		return active_flag;
	}

	public void setActive_flag(Boolean active_flag) {
		this.active_flag = active_flag;
	}
	
	public BootcampPeriod() {
		// TODO Auto-generated constructor stub
	}

}
