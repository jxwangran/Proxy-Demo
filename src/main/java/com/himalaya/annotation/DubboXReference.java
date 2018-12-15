/**   
 * Copyright © 2018 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.himalaya.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

/**
 * @Title: DubboXReference.java
 * @Package com.yijiupi.himalaya.distributedlock.annotation
 * @Description:
 * @author wangran
 * @date 2018年11月22日 下午5:56:04
 * @version V1.0
 */
@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DubboXReference {

	String url() default "http://197.168.12.119:40001";
	
	String value() default "/driver/direct/waitPickOrderList";
	
	RequestMethod requestMethod() default RequestMethod.GET;
	
}
