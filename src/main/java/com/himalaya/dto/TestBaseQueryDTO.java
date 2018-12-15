/**   
 * Copyright © 2017 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.himalaya.dto;

import java.io.Serializable;

/**
 * @ClassName: DriverBaseQueryDTO
 * @Description: 查询基础DTO
 * @author wangran
 * @date 2018年4月9日 上午11:47:54
 * 
 */
public class TestBaseQueryDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 司机Id
	 */
	private Integer userId;
	/**
	 * 城市Id
	 */
	private Integer cityId;
	/**
	 * 批次Id
	 */
	private Long taskId;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

}
