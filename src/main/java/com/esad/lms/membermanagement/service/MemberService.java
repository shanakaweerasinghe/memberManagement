package com.esad.lms.membermanagement.service;

import java.util.List;

import com.esad.lms.membermanagement.model.Member;

public interface MemberService {

	List<Member> findAll();

	void insertMember(Member member);

	void updateMember(Member member);

	void deleteMember(Member member);

}
