package com.rojel.gsgfreiberg;

import java.io.Serializable;

public class Lesson implements Serializable {
	private static final long serialVersionUID = -1736056634405169142L;
	
	public String date;
	public String day;
	public String classname;
	public String teacher;
	public String subject;
	public String lesson;
	public String newSubject;
	public String newTeacher;
	public String room;
	public String instead;
	
	public Lesson (String date, String day, String classname, String teacher, String subject, String lesson, String newSubject, String newTeacher, String room, String instead) {
		this.date = date;
		this.day = day;
		this.classname = classname;
		this.teacher = teacher;
		this.subject = subject;
		this.lesson = lesson;
		this.newSubject = newSubject;
		this.newTeacher = newTeacher;
		this.room = room;
		this.instead = instead;
	}
}
