/**   
 * Copyright © 2018 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.himalaya.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

/**    
* @Title: DubboXAnnotationBeanPostProcessor.java  
* @Package com.yijiupi.himalaya.distributedlock.dubbo  
* @Description: 
* @author wangran 
* @date 2018年11月23日 上午10:08:29  
* @version V1.0    
*/
public class DubboXAnnotationBeanPostProcessor implements BeanDefinitionRegistryPostProcessor {
	
	private String packagesToScan;
	
	public DubboXAnnotationBeanPostProcessor(String packagesToScan) {
		this.packagesToScan = packagesToScan;
	}
	
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory paramConfigurableListableBeanFactory)
			throws BeansException {
		System.err.println("======");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry paramBeanDefinitionRegistry)
			throws BeansException {
		System.err.println("-----");
	}

}
