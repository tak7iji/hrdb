package org.sample.domain.service.lock;

import javax.inject.Inject;

import org.sample.domain.repository.lock.PessimisticLock;
import org.springframework.dao.PessimisticLockingFailureException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class FindDataImpl implements FindData {
	@Inject
	PessimisticLock pessimisticLock;

	@Override
	public String findOne(Integer id) {
		return pessimisticLock.findOne(id);
	}

}
