package io.datajek.spring.basics.movie_recommender_system.lesson16;

import io.datajek.spring.basics.movie_recommender_system.lesson2.Filter;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class RecommenderImplementation {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private Filter filter;

    @Autowired
    public void setFilter(Filter filter) {
        logger.info("In RecommenderImplementation setter method..dependency injection");
        this.filter = filter;
    }

    public String[] recommendMovies (String movie) {
        System.out.println("\nName of the filter in use: " + filter + "\n");

        return filter.getRecommendations("Finding Dory");
    }
}
