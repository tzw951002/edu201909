package edu201909.spring.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import edu201909.spring.domain.EmpInfo;

public interface EmpMapper {
	static String COLUMN_ALL = "empno,ename,job,mgr,hiredate,sal,deptno";

	@Select("SELECT " + COLUMN_ALL + " FROM emp")
	@ResultMap("empResultMapper")
	List<EmpInfo> getEmpList();
	
	@Insert(value = { "" })
	int insertEmp(EmpInfo empInfos);
}
