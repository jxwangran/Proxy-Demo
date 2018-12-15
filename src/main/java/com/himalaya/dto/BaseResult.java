package com.himalaya.dto;

/*********************************************
 * ClassName: BaseResult Description: 返回数据基类
 * @author wangran Date 2016年3月04日
 *********************************************/
public class BaseResult {
	private Integer code = 0;
	private String message;
	private String result;
	private int totalCount = 0;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public BaseResult() {
	}

	public BaseResult(String message, String result) {
		this.message = message;
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}


}
