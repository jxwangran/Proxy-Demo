/**   
 * Copyright © 2018 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.himalaya.processor;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ObjectUtils;
import org.springframework.util.ReflectionUtils;

import com.himalaya.annotation.DubboXInterface;
import com.himalaya.annotation.DubboXReference;
import com.himalaya.proxy.CGlibProxy;

/**    
* @Title: DubboXBeanPostProcessor.java  
* @Package com.yijiupi.himalaya.distributedlock.dubbo  
* @Description: 
* @author wangran 
* @date 2018年11月23日 上午9:49:37  
* @version V1.0    
*/
public class DubboXBeanPostProcessor implements BeanPostProcessor, ReflectionUtils.FieldFilter {

	private CGlibProxy proxy = new CGlibProxy();
	private Map<String, Object> dubboXReference = new ConcurrentHashMap<>();
	
	@Override
	public Object postProcessBeforeInitialization(Object paramObject, String paramString) throws BeansException {
		Field[] fields = paramObject.getClass().getDeclaredFields();
		if (fields.length == 0) {
			return paramObject;
		}
		
		ReflectionUtils.doWithFields(paramObject.getClass(), new ReflectionUtils.FieldCallback() {
			@Override
			public void doWith(Field field) throws IllegalArgumentException, IllegalAccessException {
				if (!field.isAccessible()) {
					field.setAccessible(true);
				}
				DubboXReference ref = field.getAnnotation(DubboXReference.class);
				Object proxyObj = dubboXReference.get(field.getType().getName());
				DubboXInterface xInterface = field.getType().getAnnotation(DubboXInterface.class);
				if (xInterface != null) {
					System.err.println(xInterface.packageName());
				}
				if (proxyObj == null) {
					proxyObj = proxy.getProxy(field.getType(), ref);
				}
				field.set(paramObject, proxyObj);
			}
		}, this);
		return paramObject;
	}

	@Override
	public Object postProcessAfterInitialization(Object paramObject, String paramString) throws BeansException {
		return paramObject;
	}

	@Override
	public boolean matches(Field field) {
		DubboXReference ref = field.getAnnotation(DubboXReference.class);
		return !ObjectUtils.isEmpty(ref);
	}


}
