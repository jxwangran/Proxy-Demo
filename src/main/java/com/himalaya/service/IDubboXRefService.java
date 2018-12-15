/**   
 * Copyright © 2018 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.himalaya.service;

import java.util.List;

import com.himalaya.annotation.DubboXInterface;
import com.himalaya.dto.CountResult;
import com.himalaya.dto.TestBaseQueryDTO;
import com.himalaya.dto.TestDubbXDTO;

/**    
* @Title: IDriverFetchOrderService.java  
* @Package com.yijiupi.himalaya.distributedlock.service  
* @Description: 
* @author wangran 
* @date 2018年11月23日 上午9:41:49  
* @version V1.0    
*/
@DubboXInterface(packageName="com.yijiupi.himalaya.tms.service")
public interface IDubboXRefService {
	
	CountResult<List<TestDubbXDTO>> waitPickOrderList(TestBaseQueryDTO queryDTO);
	
}
