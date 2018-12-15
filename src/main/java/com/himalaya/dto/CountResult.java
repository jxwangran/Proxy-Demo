/**   
 * Copyright © 2017 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.himalaya.dto;

/** 
* @ClassName: CountResult 
* @Description: 
* @author wangran
* @date 2018年8月13日 下午5:43:47 
*  
*/
public class CountResult<T> extends ROResult<T>{

	/**
	 * 大件数量
	 */
	private int maxCount;
	/**
	 * 小件数量
	 */
	private int minCount;
	public int getMaxCount() {
		return maxCount;
	}
	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}
	public int getMinCount() {
		return minCount;
	}
	public void setMinCount(int minCount) {
		this.minCount = minCount;
	}
	
	
	
}
