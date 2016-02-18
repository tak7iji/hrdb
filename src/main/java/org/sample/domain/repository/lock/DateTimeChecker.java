package org.sample.domain.repository.lock;

import org.sample.domain.model.DateTimeCriteria;

public interface DateTimeChecker {
	public long findId(DateTimeCriteria criteria);
}
