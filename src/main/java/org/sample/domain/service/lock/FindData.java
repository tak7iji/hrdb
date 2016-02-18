package org.sample.domain.service.lock;

import java.util.List;

import org.sample.domain.model.MultipleInsertBag;

public interface FindData {
	public String findOne(Integer id);
	
	public long findId();
	
	public void insertAll();
}
