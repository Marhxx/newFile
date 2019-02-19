package com.spring.server.service;

import com.spring.base.service.BaseService;
import com.spring.server.entity.TbTeacher;

public interface TbTeacherService extends BaseService<TbTeacher,Long>{
  
	TbTeacher findOne(TbTeacher tbTeacher);
}
