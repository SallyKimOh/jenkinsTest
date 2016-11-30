package com.work;

import java.util.ArrayList;
import java.util.List;

public class RDBLectureService implements LectureService{

	@Override
	public void insertLecture(LectureDAO dao) {
		System.out.println("insert success");
	}

	@Override
	public List<LectureDAO> selectLecture() {
		LectureDAO lectureDAO = new LectureDAO();
		lectureDAO.setComment("강의 설명입니다.");
		lectureDAO.setName("CI 환경 구축");
		lectureDAO.setInstructor("소공");
		
		List<LectureDAO> lectureList = new ArrayList<LectureDAO>();
		lectureList.add(lectureDAO);
		
		return lectureList;
	}

}
