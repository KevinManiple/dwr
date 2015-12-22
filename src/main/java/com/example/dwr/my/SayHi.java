package com.example.dwr.my;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SayHi {

	private final static Logger	LOGGER	= LogManager.getLogger(SayHi.class);

	public String getHi(String name) {
		LOGGER.info("Hi,{}", name);
		return "Hi," + name;
	}
}
