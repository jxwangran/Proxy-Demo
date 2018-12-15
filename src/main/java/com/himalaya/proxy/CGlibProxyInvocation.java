/**   
 * Copyright © 2018 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.himalaya.proxy;

import java.lang.reflect.Method;

import com.google.gson.Gson;
import com.himalaya.annotation.DubboXReference;
import com.himalaya.http.HttpClientUtil;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**    
* @Title: CGlibProxyInvocation.java  
* @Package com.yijiupi.himalaya.distributedlock.proxy  
* @Description: 
* @author wangran 
* @date 2018年11月23日 下午2:30:00  
* @version V1.0    
*/
public class CGlibProxyInvocation implements MethodInterceptor {
	
	private final DubboXReference ref;
	private static Gson gson = new Gson();
	
	public CGlibProxyInvocation(DubboXReference ref) {
		this.ref = ref;
	}
	
	@Override
	public Object intercept(Object paramObject, Method paramMethod, Object[] paramArrayOfObject,
			MethodProxy paramMethodProxy) throws Throwable {
		System.err.println("开始执行intercept");
		String result = HttpClientUtil.doPost(ref.url() + ref.value(), gson.toJson(paramArrayOfObject[0]));
		System.err.println("执行结束intercept,结果：" + result);
		return gson.fromJson(result, paramMethod.getReturnType());
	}

}
