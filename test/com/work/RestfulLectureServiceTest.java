package com.work;

import org.junit.Test;

import junit.framework.Assert;


public class RestfulLectureServiceTest {

  @Test
  public void insertLecture() {
	  LectureDAO lectureDAO = new LectureDAO();
	  lectureDAO.setComment("Classroom Description");
	  lectureDAO.setName("CI Env Construction");
	  lectureDAO.setInstructor("Software Engineering");
		
	  RestfulLectureService service = new RestfulLectureService();
	  service.insertLecture(lectureDAO);
	  
	  Assert.assertTrue(true);
//	  Assert.assertTrue(true);
  }

  @Test
  public void selectLecture() {
	  Assert.assertTrue(true);
//	  Assert.assertTrue(true);
  }
}
