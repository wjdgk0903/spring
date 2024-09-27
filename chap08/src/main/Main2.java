package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppCtx;
import spring.MemberDao2;

public class Main2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx 
		     = new AnnotationConfigApplicationContext(AppCtx.class);

		MemberDao2 dbQuery = ctx.getBean(MemberDao2.class);
		System.out.println(dbQuery.selectByEmail("aaa@korea.com"));
		ctx.close();
	}
}
