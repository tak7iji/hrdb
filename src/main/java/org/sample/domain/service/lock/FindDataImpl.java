package org.sample.domain.service.lock;

import javax.inject.Inject;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.sample.domain.model.DateTimeCriteria;
import org.sample.domain.repository.lock.DateTimeChecker;
import org.sample.domain.repository.lock.PessimisticLock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class FindDataImpl implements FindData {
    private static final Logger logger = LoggerFactory
            .getLogger(FindDataImpl.class);
    
    @Inject
	PessimisticLock pessimisticLock;

	@Inject
	DateTimeChecker checker;
	
	@Override
	public String findOne(Integer id) {
		return pessimisticLock.findOne(id);
	}

	@Override
	public long findId() {
		DateTime dt = DateTimeFormat.forPattern("yyyy/MM/dd HH:mm:ss.S").parseDateTime("2016/02/18 10:10:00.1");
		logger.info("FixedDate: {}", dt.toString());
		
		DateTimeCriteria criteria = new DateTimeCriteria();
		criteria.setTimestamp(dt);
		return checker.findId(criteria);
	}

}
