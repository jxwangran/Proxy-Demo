/**   
 * Copyright © 2018 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.himalaya.proxy;

import com.himalaya.annotation.DubboXReference;

import net.sf.cglib.proxy.Enhancer;

/**    
* @Title: CGlibProxy.java  
* @Package com.yijiupi.himalaya.distributedlock.proxy  
* @Description: 
* @author wangran 
* @date 2018年11月23日 下午4:25:30  
* @version V1.0    
*/
public class CGlibProxy {

	public <T> T getProxy(Class<T> targetClass, DubboXReference ref) {
        return (T) Enhancer.create(targetClass, new CGlibProxyInvocation(ref));
    }
	
}
