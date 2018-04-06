package org.fkit.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.fkit.domain.Employee;
import org.fkit.mapper.EmployeeMapper;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class DynamicSQLTest {

    public static void main(String[] args) throws Exception {
        // 读取mybatis-config.xml文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        // 初始化mybatis，创建SqlSessionFactory类的实例
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
                .build(inputStream);
        // 创建Session实例
        SqlSession session = sqlSessionFactory.openSession();

        DynamicSQLTest t = new DynamicSQLTest();

//		t.testSelectEmployeeByIdLike(session);

//		t.testSelectEmployeeByLoginLike(session);

//		t.testSelectEmployeeChoose(session);

//		t.testFindEmployeeLike(session);

//		t.testSelectEmployeeLike(session);

//		t.testUpdateEmployeeIfNecessary(session);

//		t.testSelectEmployeeIn(session);

        t.testSelectEmployeeLikeName(session);

        // 提交事务
        session.commit();
        // 关闭Session
        session.close();
    }

    // 测试<select id="selectEmployeeByIdLike" ...>
    @Test
    public void testSelectEmployeeByIdLike(SqlSession session) {
        // 获得EmployeeMapper接口的代理对象
        EmployeeMapper em = session.getMapper(EmployeeMapper.class);
        // 创建一个HashMap存储参数
        HashMap<String, Object> params = new HashMap<>();
        // 设置id属性
        params.put("id", 1);
        // 调用EmployeeMapper接口的selectEmployeeByIdLike方法
        List<Employee> list = em.selectEmployeeByIdLike(params);
        // 查看返回结果
        list.forEach(System.out::println);
    }

    @Test
    public void testSelectEmployeeByLoginLike(SqlSession session) {
        EmployeeMapper em = session.getMapper(EmployeeMapper.class);
        HashMap<String, Object> params = new HashMap<>();
        // 设置loginname和password属性
        params.put("loginname", "jack");
        params.put("password", "123456");
        List<Employee> list = em.selectEmployeeByLoginLike(params);
        list.forEach(System.out::println);
    }

    @Test
    public void testSelectEmployeeChoose(SqlSession session) {
        EmployeeMapper em = session.getMapper(EmployeeMapper.class);
        HashMap<String, Object> params = new HashMap<>();
        // 设置id属性
//		params.put("id", 1);
//		params.put("loginname", "jack");
//		params.put("password", "123456");
        List<Employee> list = em.selectEmployeeChoose(params);
        list.forEach(System.out::println);
    }

    @Test
    public void testFindEmployeeLike(SqlSession session) {
        EmployeeMapper em = session.getMapper(EmployeeMapper.class);
        HashMap<String, Object> params = new HashMap<>();
        params.put("id", 1);
        List<Employee> list = em.findEmployeeLike(params);
        list.forEach(System.out::println);
    }

    @Test
    public void testSelectEmployeeLike(SqlSession session) {
        EmployeeMapper em = session.getMapper(EmployeeMapper.class);
        HashMap<String, Object> params = new HashMap<>();
        // 设置state属性和id属性
        params.put("id", 1);
        params.put("loginname", "jack");
        params.put("password", "123456");
        List<Employee> list = em.selectEmployeeLike(params);
        list.forEach(System.out::println);
    }

    @Test
    public void testUpdateEmployeeIfNecessary(SqlSession session) {
        EmployeeMapper em = session.getMapper(EmployeeMapper.class);
        Employee employee = em.selectEmployeeWithId(4);
        // 设置需要修改的属性
        employee.setLoginname("mary");
        employee.setPassword("123");
        employee.setName("玛丽");
        em.updateEmployeeIfNecessary(employee);
    }

    @Test
    public void testSelectEmployeeIn(SqlSession session) {
        EmployeeMapper em = session.getMapper(EmployeeMapper.class);
        // 创建List集合
        List<Integer> ids = new ArrayList<>();
        // 往List集合中添加两个测试数据
        ids.add(1);
        ids.add(2);
        List<Employee> list = em.selectEmployeeIn(ids);
        list.forEach(System.out::println);
    }

    @Test
    public void testSelectEmployeeLikeName(SqlSession session) {
        EmployeeMapper em = session.getMapper(EmployeeMapper.class);
        Employee employee = new Employee();
        // 设置模糊查询的参数
        employee.setName("o");
        List<Employee> list = em.selectEmployeeLikeName(employee);
        list.forEach(System.out::println);
    }


}
