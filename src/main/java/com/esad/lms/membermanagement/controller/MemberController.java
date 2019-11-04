package com.esad.lms.membermanagement.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esad.lms.membermanagement.model.Member;
import com.esad.lms.membermanagement.service.MemberService;

@RestController
@RequestMapping("/memberManagement")
public class MemberController {
	
	@Resource 
	MemberService memberService;
	
	@GetMapping(value = "/memberList")
	public List<Member> getBooks() {
		return memberService.findAll();
	
	}
	
	@PostMapping(value = "/insertMember")
	public void createBook(@RequestBody Member member) {
		memberService.insertMember(member);
	
	}
	@PutMapping(value = "/updateMember")
	public void updateBook(@RequestBody Member member) {
		memberService.updateMember(member);
	
	}
	
	
	@DeleteMapping(value = "/deleteMember")
	public void deleteBook(@RequestBody Member member) {
		memberService.deleteMember(member);
	
	}

}
