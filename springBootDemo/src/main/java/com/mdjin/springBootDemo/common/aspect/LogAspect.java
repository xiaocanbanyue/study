package com.mdjin.springBootDemo.common.aspect;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * 日志切面
 * @author Administrator
 *
 */
@Aspect
@Component
public class LogAspect {

	private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);
	
	@Pointcut("@annotation(com.mdjin.springBootDemo.common.annotation.PersonalLog)")
	public void personalLogAspect() {}
	
	@Before("personalLogAspect()")
	public void doBefore(JoinPoint joinPoint) {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		
		logger.info("request||||"+request.toString());
		
		logger.info(joinPoint.getTarget().getClass().getName() + "||||" + joinPoint.getSignature().getName() + "()");
	}
	
}
