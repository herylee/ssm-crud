
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
* @version 创建时间：2019年6月10日 下午11:31:04
* 类说明
*/
/**
 * 测试dao层的工作
 * 
 * @author lee 推荐spring的项目就可以使用spring的单元测试，可以自动注入我们需要的组件 1，导入springtest模块
 *         2,@@ContextConfiguration指定
 * 
 *         3,直接autowired要使用的
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class MapperTest {

	/*
	 * 测试DepartmentMapper
	 * 
	 */

	@Autowired
	DepartmentMapper departmentMapper;

	@Autowired
	SqlSession sqlSession;

	@Test
	public void testCRUD() {
		// 1,创建 SpringIOC容器
		/*
		 * ApplicationContext ioc = new
		 * ClassPathXmlApplicationContext("applicationContext.xml");
		 * 
		 * // 2，从容器中拿出来获取mapper ioc.getBean(DepartmentMapper.class);
		 */

		System.out.println(departmentMapper);

		EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

		for (int i = 0; i < 1000; i++) {

			mapper.insertSelective(new Employee(null,"","M",))
		}

	}

}
