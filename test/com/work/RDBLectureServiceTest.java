package com.work;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class RDBLectureServiceTest {

	@Test
	public void testInsertLecture() {
		LectureDAO lectureDAO = new LectureDAO();
		lectureDAO.setComment("강의 설명입니다.");
		lectureDAO.setName("CI 환경 구축");
		lectureDAO.setInstructor("소공");
		
		LectureService service = new RDBLectureService();
		service.insertLecture(lectureDAO);
		
//		assertTrue(true);
	}

	@Test
	public void testSelectLecture() {
		LectureService service = new RDBLectureService();
		List<LectureDAO> list = service.selectLecture();
		
		assertEquals(1, list.size());
	}

}
