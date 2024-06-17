package io.datajek.spring.basics.movie_recommender_system.lesson13;

import io.datajek.spring.basics.movie_recommender_system.lesson2.Filter;

import javax.inject.Named;

@Named("CF")
public class CollaborativeFilter implements Filter {

    public CollaborativeFilter() {
        super();
        System.out.println("collaborative filter constructor called");
    }

    public String[] getRecommendations(String movie) {
        //logic of collaborative filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
