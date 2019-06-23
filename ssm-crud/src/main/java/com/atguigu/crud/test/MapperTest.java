
package com.atguigu.crud.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.atguigu.crud.bean.Employee;
import com.atguigu.crud.dao.DepartmentMapper;
import com.atguigu.crud.dao.EmployeeMapper;

/**
* @author hery186
* @version ����ʱ�䣺2019��6��10�� ����11:31:04
* ��˵��
*/
/**
 * ����dao��Ĺ���
 * 
 * @author lee �Ƽ�spring����Ŀ�Ϳ���ʹ��spring�ĵ�Ԫ���ԣ������Զ�ע��������Ҫ����� 1������springtestģ��
 *         2,@@ContextConfigurationָ��
 * 
 *         3,ֱ��autowiredҪʹ�õ�
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class MapperTest {

	/*
	 * ����DepartmentMapper
	 * 
	 */

	@Autowired
	DepartmentMapper departmentMapper;

	@Autowired
	SqlSession sqlSession;

	@Test
	public void testCRUD() {
		// 1,���� SpringIOC����
		/*
		 * ApplicationContext ioc = new
		 * ClassPathXmlApplicationContext("applicationContext.xml");
		 * 
		 * // 2�����������ó�����ȡmapper ioc.getBean(DepartmentMapper.class);
		 */

		System.out.println(departmentMapper);

		EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

		for (int i = 0; i < 1000; i++) {

			mapper.insertSelective(new Employee(null,"","M",))
		}

	}

}
