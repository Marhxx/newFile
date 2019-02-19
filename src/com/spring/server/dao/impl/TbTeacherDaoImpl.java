package com.spring.server.dao.impl;
import org.springframework.stereotype.Repository;
import com.spring.base.dao.impl.BaseDaoMysqlImpl;
import com.spring.server.dao.TbTeacherDao;
import com.spring.server.entity.TbTeacher;
@Repository
public class TbTeacherDaoImpl extends BaseDaoMysqlImpl<TbTeacher,Long> implements TbTeacherDao{

	public TbTeacherDaoImpl(){
		super(TbTeacher.class);
	}
}
