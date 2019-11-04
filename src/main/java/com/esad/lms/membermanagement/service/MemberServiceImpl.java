package com.esad.lms.membermanagement.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.esad.lms.membermanagement.model.Member;
import com.esad.lms.membermanagement.repository.MemberRepository;

@Component
public class MemberServiceImpl implements MemberService {
	
	@Resource
	MemberRepository memberRepository;

	@Override
	public List<Member> findAll() {
		// TODO Auto-generated method stub
		return memberRepository.findAll();
	}


	@Override
	public void insertMember(Member member) {
		// TODO Auto-generated method stub
		memberRepository.insertMember(member);

	}

	@Override
	public void updateMember(Member member) {
		// TODO Auto-generated method stub
		memberRepository.updateMember(member);

	}

	@Override
	public void deleteMember(Member member) {
		// TODO Auto-generated method stub
		memberRepository.deleteMember(member);

	}

}
