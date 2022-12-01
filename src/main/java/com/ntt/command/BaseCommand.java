package com.ntt.command;

import com.ntt.exceptions.Msad0ForbiddenException;
import com.ntt.utils.LoggerUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseCommand<R> {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	protected boolean canExecute() throws Msad0ForbiddenException {
		return true;
	}

	protected R doExecute() throws Exception {
		return null;
	}

	public R execute() throws Exception {
		if (canExecute()) {
			return doExecute();
		} else {
			throw new Msad0ForbiddenException(LoggerUtils.formatArchRow("Cannot execute command"));
		}
	}
}
