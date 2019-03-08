package com.enigma.task.bootcamp.dto;

public class BootcampPeriodDto {
	public Integer id;
	public Integer batchId;
	public Integer weekId;
	public String description;
	public boolean activeFlag;
	
	public BootcampPeriodDto(Integer id, Integer batchId, Integer weekId, String description, boolean activeFlag) {
		this.id = id;
		this.batchId = batchId;
		this.weekId = weekId;
		this.description = description;
		this.activeFlag = activeFlag;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBatchId() {
		return batchId;
	}

	public void setBatchId(Integer batchId) {
		this.batchId = batchId;
	}

	public Integer getWeekId() {
		return weekId;
	}

	public void setWeekId(Integer weekId) {
		this.weekId = weekId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(boolean activeFlag) {
		this.activeFlag = activeFlag;
	}

	public BootcampPeriodDto() {}
}
