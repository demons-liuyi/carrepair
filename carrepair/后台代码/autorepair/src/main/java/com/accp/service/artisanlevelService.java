package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Artisan;
import com.accp.domain.Artisanlevel;
import com.accp.mapper.ArtisanMapper;
import com.accp.mapper.ArtisanlevelMapper;

@Service
@Transactional
public class artisanlevelService {
			@Autowired
			ArtisanlevelMapper al;
			@Autowired
			ArtisanMapper ar;
			public List<Artisanlevel> query(){
				return al.selectByExample(null);
			}
			public int add(Artisanlevel level) {
				return al.insert(level);
			}
			public int delete(Integer id) {
				return al.deleteByPrimaryKey(id);
			}
			public int update(Artisanlevel level) {
				return al.updateByPrimaryKey(level);
			}
			public List<Artisan> selectByWhere(String bzid,String sel){
				return ar.selectByWhere(bzid, sel);
			}
			public int addArtisan(Artisan artisan) {
				return	ar.insert(artisan);
			}
			public int updateArtisan(Artisan artisan) {
				return	ar.updateByPrimaryKey(artisan);
			}
			public int deleteArtisan(String artisanno) {
				return ar.deleteByPrimaryKey(artisanno);
			}
			
			
}
