package io.datajek.spring.basics.movie_recommender_system.lesson6;

import io.datajek.spring.basics.movie_recommender_system.lesson2.Filter;
import org.springframework.stereotype.Component;

@Component("CBF")
public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
