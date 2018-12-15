/**   
 * Copyright © 2018 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.himalaya.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.himalaya.processor.DubboXAnnotationBeanPostProcessor;
import com.himalaya.processor.DubboXBeanPostProcessor;

/**    
* @Title: DubboXConfiguration.java  
* @Package com.yijiupi.himalaya.distributedlock.configuration  
* @Description: 
* @author wangran 
* @date 2018年11月23日 上午10:24:16  
* @version V1.0    
*/
@Configuration
public class DubboXConfiguration {

	@Bean
	public DubboXAnnotationBeanPostProcessor createProcessor(@Value("${dubbox.packagesToScan}") String packagesToScan) {
		DubboXAnnotationBeanPostProcessor processor = new DubboXAnnotationBeanPostProcessor(packagesToScan);
		return processor;
	}
	
	@Bean
	public DubboXBeanPostProcessor createPostProcessor() {
		DubboXBeanPostProcessor processor = new DubboXBeanPostProcessor();
		return processor;
	}
	
}
