package com.ssm.chapter9.bean;

import org.springframework.beans.factory.DisposableBean;

public class DisposableBeanImpl implements DisposableBean {

	public void destroy() throws Exception {
		System.out.println("调用接口DisposableBean的destroy方法");
	}

}
