package io.datajek.spring.basics.movie_recommender_system.lesson13;

import io.datajek.spring.basics.movie_recommender_system.lesson2.Filter;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class RecommenderImplementation {

    @Inject
    @Qualifier("CF")
    private Filter filter;

    public Filter getFilter() {
        return this.filter;
    }

    public String[] recommendMovies (String movie) {
        System.out.println("\nName of the filter in use: " + filter + "\n");

        return filter.getRecommendations("Finding Dory");
    }
}
