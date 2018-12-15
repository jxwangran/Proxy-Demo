package com.himalaya.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMethod;

import com.himalaya.annotation.DubboXReference;
import com.himalaya.dto.CountResult;
import com.himalaya.dto.TestBaseQueryDTO;
import com.himalaya.dto.TestDubbXDTO;


@Service
public class DubbXTestService {

	@DubboXReference(requestMethod = RequestMethod.POST)
	private IDubboXRefService service;

	public CountResult<List<TestDubbXDTO>> waitPickOrderList(TestBaseQueryDTO queryDTO) {
		System.err.println("执行waitPickOrderList");
		return service.waitPickOrderList(queryDTO);
		
	}

}
