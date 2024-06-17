package io.datajek.spring.basics.movie_recommender_system.lesson11;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode=ScopedProxyMode.TARGET_CLASS)
public class Movie {

    private Logger logger =
            LoggerFactory.getLogger(this.getClass());

    private int id;
    private String name;
    private String genre;
    private String producer;

    public Movie() {
        super();
        System.out.println("Movie constructor called");
    }

    @PostConstruct
    private void postConstruct() {
        //initialization code
        logger.info("In Movie postConstruct method");
    }

    @PreDestroy
    private void preDestroy() {
        //cleanup code
        logger.info("In Movie preDestroy method");
    }
}
