package com.spring.common.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.base.dao.BaseDao;
import com.spring.base.service.impl.BaseServiceImpl;
import com.spring.base.utils.StringUtil;
import com.spring.common.dao.TbPhotoDao;
import com.spring.common.entity.TbPhoto;
import com.spring.common.service.TbPhotoService;

@Service("tbPhotoService")
@Transactional
public class TbPhotoServiceImpl extends BaseServiceImpl<TbPhoto, Long> implements TbPhotoService {

	@Resource
	TbPhotoDao tbPhotoDao;

	@Override
	public BaseDao<TbPhoto, Long> getGenericDao() {
		return tbPhotoDao;
	}

	@Override
	public TbPhotoDao getTbPhotoDao() {
		return tbPhotoDao;
	}

	@Override
	public List<TbPhoto> searchp(String id) {
		if(id!=null && id.trim().length()!=0){
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("SELECT * FROM tb_photo ");
			sbSql.append("WHERE tp_album_id="+id+" and tp_status != 0 ORDER BY tp_id DESC");
			return tbPhotoDao.search(sbSql.toString(), null);
		}
		return null;
	}

	@Override
	public List<TbPhoto> findByAlbumId(String id) {
		StringBuffer sbSql = new StringBuffer();
		sbSql.append("SELECT * FROM tb_photo ");
		sbSql.append("WHERE tp_album_id="+id+" and tp_status != 0 ORDER BY tp_id DESC");
		return tbPhotoDao.search(sbSql.toString(), null);
	}

}
