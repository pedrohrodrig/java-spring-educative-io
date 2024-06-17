package io.datajek.spring.basics.movie_recommender_system.lesson13;

import io.datajek.spring.basics.movie_recommender_system.lesson2.Filter;

import javax.inject.Named;

@Named
public class ContentBasedFilter implements Filter {

    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
