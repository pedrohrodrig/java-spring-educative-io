package io.datajek.spring.basics.movie_recommender_system.lesson14;

import io.datajek.spring.basics.movie_recommender_system.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class RecommenderImplementation {

    @Autowired
    private Filter filter;

    public Filter getFilter() {
        return this.filter;
    }

    public void setFilter(Filter filter)
    {
        this.filter = filter;
    }

    public RecommenderImplementation() {
        super();
    }

    public RecommenderImplementation(Filter filter) {
        this.filter = filter;
    }

    public String[] recommendMovies (String movie) {
        System.out.println("\nName of the filter in use: " + filter + "\n");

        return filter.getRecommendations("Finding Dory");
    }
}
