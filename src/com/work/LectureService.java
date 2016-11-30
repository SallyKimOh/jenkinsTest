package com.work;

import java.util.List;

public interface LectureService {

	public void insertLecture(LectureDAO dao);
	
	public List<LectureDAO> selectLecture();
	
}
