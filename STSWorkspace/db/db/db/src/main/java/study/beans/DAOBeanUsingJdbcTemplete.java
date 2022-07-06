package study.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import studyDO.productDO;

@Component
public class DAOBeanUsingJdbcTemplete {

	@Autowired
	private JdbcTemplate templete; // autowired kela obj la
	public void insert(int pid, String name, int cost)
	{
		//use this for any DML query-- update madhe DML deto 
		templete.update("insert into product values(?,?,?)",pid,name,cost);// pudhch 
	}
	
	public List<productDO> getProducts()// creating objects of 
	{
		List<productDO> list = templete.query("select * from product", (rs,rownum)->{ return new productDO(rs.getInt(1),rs.getString(2),rs.getInt(3));});
		return list;
	}
}
