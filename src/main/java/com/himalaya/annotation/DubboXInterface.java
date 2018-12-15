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
* @Title: DubboXInterface.java  
* @Package com.yijiupi.himalaya.distributedlock.annotation  
* @Description: 
* @author wangran 
* @date 2018年11月24日 上午10:56:18  
* @version V1.0    
*/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DubboXInterface {
	
	String packageName() default "";
	
}
