package org.sample.domain.repository.lock;

import java.util.List;

import org.sample.domain.model.MultipleInsertBag;

public interface MultipleInsert {
	public void insertAll(List<MultipleInsertBag> asList);
}
