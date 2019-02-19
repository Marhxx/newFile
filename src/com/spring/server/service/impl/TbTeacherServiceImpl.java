package com.spring.server.service.impl;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.spring.base.dao.BaseDao;
import com.spring.base.service.impl.BaseServiceImpl;
import com.spring.server.dao.TbTeacherDao;
import com.spring.server.entity.TbTeacher;
import com.spring.server.service.TbTeacherService;
@Service("tbTeacherService")
public class TbTeacherServiceImpl extends BaseServiceImpl<TbTeacher,Long>implements TbTeacherService{
  
	@Resource
	TbTeacherDao tbTeacherDao;
	
	@Override
	public BaseDao<TbTeacher, Long> getGenericDao() {
		return tbTeacherDao;
	}
	
	@Override
	public TbTeacher findOne(TbTeacher tbTeacher) {
		return tbTeacherDao.searchOne(tbTeacher);
	}



	

}
