package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Jurisdiction;
import com.accp.mapper.JurisdictionMapper;

@Service
@Transactional
public class jurisdictionService {

	@Autowired
	JurisdictionMapper jm;
	
	public List<Jurisdiction> findEach(Integer postid){
		List<Jurisdiction> list=jm.selectJurisdictionByPostid(postid);
		Jurisdiction jur=new Jurisdiction();
		jur.setId(0);
		each(jur,list);
		return jur.getChildrens();
	}
	
	public void each(Jurisdiction jur,List<Jurisdiction> jurs) {
		for(Jurisdiction j:jurs) {
			if(j.getParentid()==jur.getId()) {
				Jurisdiction newjur=new Jurisdiction();
				newjur.setId(j.getId());
				newjur.setCatalog(j.getCatalog());
				newjur.setEname(j.getEname());
				newjur.setJurisdictionname(j.getJurisdictionname());
				newjur.setParentid(j.getParentid());
				newjur.setPath(j.getPath());
				newjur.setParentid(j.getPostid());
				newjur.setJudge(j.getJudge());
				jur.getChildrens().add(newjur);
				each(newjur,jurs);
			}
		}
	}
}
