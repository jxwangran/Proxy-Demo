package com.himalaya.dto;

public class ROResult<T> extends BaseResult {

	T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
