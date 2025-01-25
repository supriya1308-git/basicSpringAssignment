package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.AppConfig;
import com.nt.sbeans.Student;

public class DependencyInjectionTest {
public static void main(String[] args) {
	System.out.println("DependencyInjectionTest.main()-started");
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	Student student=ctx.getBean("stu",Student.class);
	student.displayStudentDetails();
	System.out.println("DependencyInjectionTest.main()-ended");
	ctx.close();
}
}
