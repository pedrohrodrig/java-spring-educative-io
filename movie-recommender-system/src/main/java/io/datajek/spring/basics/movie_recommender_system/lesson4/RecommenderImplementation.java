package io.datajek.spring.basics.movie_recommender_system.lesson4;

import io.datajek.spring.basics.movie_recommender_system.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    @Autowired
    private Filter filter;

    public RecommenderImplementation(Filter filter) {
        super();
        this.filter = filter;
    }

    public String[] recommendMovies (String movie) {
        System.out.println("Name of the filter in use: " + filter);

        return filter.getRecommendations("Finding Dory");
    }
}
