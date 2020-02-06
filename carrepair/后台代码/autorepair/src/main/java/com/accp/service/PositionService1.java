package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Post;
import com.accp.domain.PostExample;
import com.accp.mapper.PostMapper;

@Service
@Transactional
public class PositionService1 {
	@Autowired
	PostMapper post;

	/**
	 * 查询所有的
	 * @return
	 */
	public List<Post> selectPost(Post po) {
		
		PostExample example = new PostExample();
		PostExample.Criteria criteria = example.createCriteria();
		if (po.getId()!=null ) {
			criteria.andIdEqualTo(po.getId());
		}
		if (po.getPostname()!=null) {
			criteria.andPostnameLike(po.getPostname());
		}
		return post.selectByExample(null);
		
		
	}
	
}
