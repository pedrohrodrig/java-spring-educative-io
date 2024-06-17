package io.datajek.spring.basics.movie_recommender_system.lesson8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		ContentBasedFilter cbf1 = appContext.getBean(ContentBasedFilter.class);
		ContentBasedFilter cbf2 = appContext.getBean(ContentBasedFilter.class);
		ContentBasedFilter cbf3= appContext.getBean(ContentBasedFilter.class);

		System.out.println(cbf1);
		System.out.println(cbf2);
		System.out.println(cbf3);

		//Retrieve prototype bean from application context thrice
		CollaborativeFilter cf1 = appContext.getBean(CollaborativeFilter.class);
		CollaborativeFilter cf2 = appContext.getBean(CollaborativeFilter.class);
		CollaborativeFilter cf3 = appContext.getBean(CollaborativeFilter.class);

		System.out.println(cf1);
		System.out.println(cf2);
		System.out.println(cf3);
	}

}
