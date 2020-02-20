package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Jurisdiction;
import com.accp.mapper.JurisdictionMapper;

@Service
@Transactional
public class PermissionsService {

	@Autowired
	JurisdictionMapper jurisdictionMapper;

	public List<Jurisdiction> findEachByUid(Integer uid) {
		List<Jurisdiction> lists = jurisdictionMapper.selectJurisdictionByPostid(uid);
		Jurisdiction parentPerms = new Jurisdiction();
		parentPerms.setId(0);
		each(parentPerms, lists);
		return parentPerms.getChildrens();
	}

	public List<Jurisdiction> findEachByParentid(Integer parentid) {
		List<Jurisdiction> lists = jurisdictionMapper.findByParentid(parentid);
		Jurisdiction parentPerms = new Jurisdiction();
		parentPerms.setId(0);
		each(parentPerms, lists);
		return parentPerms.getChildrens();
	}

	public List<Jurisdiction> findByUid(Integer uid) {
		List<Jurisdiction> lists = jurisdictionMapper.findByUid(uid);
		return lists;
	}

	public Jurisdiction findById(Integer pid) {
		return jurisdictionMapper.selectByPrimaryKey(pid);
	}

	public void each(Jurisdiction parentPerms, List<Jurisdiction> perms) {
		for (Jurisdiction p : perms) {
			if (p.getParentid() == parentPerms.getId()) {
				Jurisdiction newPerms = new Jurisdiction();
				newPerms.setId(p.getId());
				newPerms.setCatalog(p.getCatalog());
				newPerms.setJurisdictionname(p.getJurisdictionname());
				newPerms.setParentid(p.getParentid());
				newPerms.setPath(p.getPath());
				newPerms.setEname(p.getEname());														
				newPerms.setJudge(p.getJudge());
				parentPerms.getChildrens().add(newPerms);														
				each(newPerms, perms);
			}
		}
	}

}
