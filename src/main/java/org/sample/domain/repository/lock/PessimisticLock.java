package org.sample.domain.repository.lock;

public interface PessimisticLock {
	public String findOne(Integer id);
}
