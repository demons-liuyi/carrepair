package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Artisanclass;
import com.accp.domain.ArtisanclassExample;
import com.accp.domain.Legworkcat;
import com.accp.mapper.ArtisanclassMapper;
import com.accp.mapper.LegworkcatMapper;

@Service
@Transactional
public class legworkcarService {
				@Autowired
				LegworkcatMapper legMapper;
				@Autowired
				ArtisanclassMapper alMapper;
				public List<Legworkcat> queryAll(){
					return legMapper.queryall();
				}
				public int add(Legworkcat level) {
					return legMapper.insert(level);
				}
				public int delete(Integer id) {
					return legMapper.deleteByPrimaryKey(id);
				}
				public int update(Legworkcat level) {
					return legMapper.updateByPrimaryKey(level);
				}
				public List<Artisanclass> selectall(){
					ArtisanclassExample example=new ArtisanclassExample();
					example.createCriteria().andParentidNotEqualTo(0);
					return alMapper.selectByExample(example);
				}
				public List<Artisanclass> selectNodes(){
					ArtisanclassExample example=new ArtisanclassExample();
					example.createCriteria().andParentidEqualTo(0);
					List<Artisanclass> list=alMapper.selectByExample(example);
					for (int i = 0; i <list.size(); i++) {
						ArtisanclassExample example1=new ArtisanclassExample();
						example1.createCriteria().andParentidEqualTo(list.get(i).getId());
						List<Artisanclass> nodes=alMapper.selectByExample(example1);
						if(nodes!=null) {
							list.get(i).setNodes(nodes);
						}
					}
					return list;
				}
				public int nodesAdd(Artisanclass al) {
					return alMapper.insert(al);
				}
				public int nodesUpdate(Artisanclass al) {
					return alMapper.updateByPrimaryKey(al);
				}
				public int nodesDelete(Integer id) {
					return alMapper.deleteByPrimaryKey(id);
				}
				
				
				
}
