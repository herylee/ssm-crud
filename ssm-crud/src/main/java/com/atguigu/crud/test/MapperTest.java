
package com.atguigu.crud.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import com.atguigu.crud.dao.DepartmentMapper;

/**
* @author hery186
* @version ����ʱ�䣺2019��6��10�� ����11:31:04
* ��˵��
*/
/**
 * ����dao��Ĺ���
 * 
 * @author lee
 * �Ƽ�spring����Ŀ�Ϳ���ʹ��spring�ĵ�Ԫ���ԣ������Զ�ע��������Ҫ�����
 * 1������springtestģ��	
 * 2,@@ContextConfigurationָ��
 */

@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class MapperTest {

	/*
	 * ����DepartmentMapper
	 * 
	 */

	@Test
	public void testCRUD() {

		// 1,���� SpringIOC����

		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2�����������ó�����ȡmapper
		ioc.getBean(DepartmentMapper.class);
	}

}
