package com.talkweb.weixin.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 系统日志�?
 * @author liuzhuoyu
 *
 */
public class LogUtil {
	private Log log = null;
	
	public LogUtil(Class clazz){
		this.log = LogFactory.getLog(clazz);
	}
	
	public void debug(Object msg){
		if(log.isDebugEnabled())
			log.debug(msg);
	}
	
		
	public void info(Object msg){
		if(log.isInfoEnabled())
			log.info(msg);
	}
	
	public void error(Object msg){
		if(log.isErrorEnabled())
			log.error(msg);
	}
	
	public void fatal(Object msg){
		if(log.isFatalEnabled())
			log.fatal(msg);
	}
	
	public void warn(Object msg){
		if(log.isWarnEnabled())
			log.warn(msg);
	}
	
	public void trace(Object msg){
		if(log.isTraceEnabled())
			log.trace(msg);
	}
	
	public void error(Object msg,Exception e){
		//e.printStackTrace();
		if(log.isErrorEnabled())
			log.error(msg,e);
	}
	
	public void error(Exception e){
		//e.printStackTrace();
		if(log.isErrorEnabled())
			log.error(e);
	}
	
	
}
