package io.datajek.spring.basics.movie_recommender_system.lesson10;

import io.datajek.spring.basics.movie_recommender_system.lesson2.Filter;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
