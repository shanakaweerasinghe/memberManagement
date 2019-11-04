package com.esad.lms.membermanagement.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.esad.lms.membermanagement.mapper.MemberRowMapper;
import com.esad.lms.membermanagement.model.Member;

@Repository
public class MemberRepositoryImpl implements MemberRepository {
	
	public MemberRepositoryImpl(NamedParameterJdbcTemplate template) {  
        this.template = template;  
}
	NamedParameterJdbcTemplate template; 

	@Override
	public List<Member> findAll() {
		// TODO Auto-generated method stub
		return template.query("select * from member", new MemberRowMapper());
	}

	@Override
	public void insertMember(Member member) {
		// TODO Auto-generated method stub
		final String sql = "insert into member(memberId,name,nic,address,email,contactNo,numberOfBookIssued,status,description) values(:memberId,:name,:nic,:address,:email,:contactNo,:numberOfBookIssued,:status,:description)";

		KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
        		.addValue("memberId", member.getMemberId())
        		.addValue("name", member.getName())
        		.addValue("nic", member.getNic())
        		.addValue("address", member.getAddress())
        		.addValue("email", member.getEmail())
        		.addValue("contactNo", member.getContactNo())
        		.addValue("numberOfBookIssued", member.getNumberOfBookIssued())
        		.addValue("status", member.getStatus())
        		.addValue("description", member.getDescription());
        template.update(sql,param, holder);
	}


	@Override
	public void updateMember(Member member) {
		// TODO Auto-generated method stub
		final String sql = "update member set memberId=:memberId,name=:name,nic=:nic,address=:address,email=:email,contactNo=:contactNo,numberOfBookIssued=:numberOfBookIssued,status=:status,description=:description where memberId=:memberId";

		KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
        		.addValue("memberId", member.getMemberId())
        		.addValue("name", member.getName())
        		.addValue("nic", member.getNic())
        		.addValue("address", member.getAddress())
        		.addValue("email", member.getEmail())
        		.addValue("contactNo", member.getContactNo())
        		.addValue("numberOfBookIssued", member.getNumberOfBookIssued())
        		.addValue("status", member.getStatus())
        		.addValue("description", member.getDescription());
        template.update(sql,param, holder);
	}


	@Override
	public void deleteMember(Member member) {
		// TODO Auto-generated method stub
		final String sql = "delete from member where memberId=:memberId";
		 

		 Map<String,Object> map=new HashMap<String,Object>();  
		 map.put("memberId", member.getMemberId());
	
		 template.execute(sql,map,new PreparedStatementCallback<Object>() {  
			    @Override  
			    public Object doInPreparedStatement(PreparedStatement ps)  
			            throws SQLException, DataAccessException {  
			        return ps.executeUpdate();  
			    }  
			});  

	}

}
