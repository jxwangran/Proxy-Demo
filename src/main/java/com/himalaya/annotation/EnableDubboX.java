/**   
 * Copyright © 2018 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.himalaya.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**    
* @Title: EnableDubboX.java  
* @Package com.himalaya.annotation  
* @Description: 
* @author wangran 
* @date 2018年12月15日 下午4:10:15  
* @version V1.0    
*/
@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnableDubboX {

	String packageName() default "";
	
}
