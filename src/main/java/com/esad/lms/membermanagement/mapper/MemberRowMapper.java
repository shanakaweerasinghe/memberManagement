package com.esad.lms.membermanagement.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.esad.lms.membermanagement.model.Member;

public class MemberRowMapper implements RowMapper<Member>{
	@Override
	public Member mapRow(ResultSet rs, int arg1) throws SQLException {
		Member member = new Member();
		member.setMemberId(rs.getString("memberId"));
		member.setName(rs.getString("name"));
		member.setNic(rs.getString("nic"));
		member.setAddress(rs.getString("address"));
		member.setEmail(rs.getString("email"));
		member.setContactNo(rs.getString("contactNo"));
		member.setNumberOfBookIssued(rs.getString("numberOfBookIssued"));
		member.setStatus(rs.getString("status"));
		member.setDescription(rs.getString("description"));
 
        return member;
}
}
