package com.work;

import java.util.List;

public class RestfulLectureService implements LectureService{

	@Override
	public void insertLecture(LectureDAO dao) {
		System.out.println("Restful insert method");
		
	}

	@Override
	public List<LectureDAO> selectLecture() {
		
		return null;
	}

}
