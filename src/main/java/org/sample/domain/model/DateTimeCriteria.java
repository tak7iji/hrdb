package org.sample.domain.model;

import org.joda.time.DateTime;

public class DateTimeCriteria {
	private DateTime ts;

	public DateTime getTimestamp() {
		return ts;
	}

	public void setTimestamp(DateTime timestamp) {
		this.ts = timestamp;
	}
}
