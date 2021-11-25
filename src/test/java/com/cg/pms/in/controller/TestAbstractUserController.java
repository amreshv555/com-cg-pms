package com.cg.pms.in.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;

import com.cg.pms.in.model.AbstractUser;
import com.cg.pms.in.repository.AbstractUserRepository;
import com.cg.pms.in.service.AbstractUserService;



@SpringBootTest
public class TestAbstractUserController {
	
	@MockBean
	private AbstractUserRepository repository;
	
	@Autowired
	private AbstractUserController controller;
	
	@Autowired
	private AbstractUserService service;
	

	@Test
	public void testRegister() {
		AbstractUser user = new AbstractUser((int)3,"admin","admin");
		when(repository.save(user)).thenReturn(user);
		assertEquals(user,service.register(user));
	}
	
	@Test
	public void testLogout() throws Exception{
		
		String logout ="User logged out successfully.";
	
	assertNotEquals(logout, service.logout(logout));
	}
}
//package com.capgemini.controller;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import com.capgemini.model.FeedBack;
//import com.capgemini.model.NGO;
//import com.capgemini.repository.IFeedBackRepository;
//import com.capgemini.repository.INGORepository;
//import com.capgemini.service.IFeedBackService;
//import com.capgemini.service.INGOService;
//
//
//
//@SpringBootTest
//public class TestFeedbackController {
//
//@MockBean
//private  IFeedBackRepository repository;
//
//@Autowired
//private FeedbackController controller;
//@Autowired
//private IFeedBackService service;
//
//@Test
//public void testAddFeedback() {
//String motive = "add";
//when(repository.).thenReturn((List<FeedBack>)Stream.of(new FeedBack()).collect(Collectors.toList()));
//assertEquals(controller.viewNGOByMotive(motive),controller.viewNGOByMotive(motive));
//
//}
//
//@Test
//public void testgetAllFeedback() {
//
//when(repository.findAll()).thenReturn((List<FeedBack>) Stream.of(new FeedBack()).collect(Collectors.toList()));
//assertEquals(controller.viewAllFeedBack(),controller.viewAllFeedBack() );
//
//}
//
////@Test
////public void testGetNgoByLocation() {
////String location = "mumbai";
////when(repository.findByNgoLocation(location)).thenReturn((List<NGO>)Stream.of(new NGO()).collect(Collectors.toList()));
////assertEquals(controller.viewNGOByLocation(location),controller.viewNGOByLocation(location));
////
////}
//
//
////@Test
////public void testGetNgoById() {
////Integer id= 1;
////when(service.viewNGO(id)).thenReturn((NGO)Stream.of(new NGO()).collect(Collectors.toList()));
////assertEquals(controller.getNgoByngoId(id),service.viewNGO(id));
////
////}
//
////@Test
////public void testSaveNgo () {
////NGO ngo= new NGO(3,"asd","asd","asd","asd",100.2,10,"asd", null);
////when(repository.save(ngo)).thenReturn(ngo);
////assertEquals(controller.addngo(ngo),controller.addngo(ngo));
////
////}
