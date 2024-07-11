package com.kubekthecreator.airbnb_clone_back.infrasctructure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories({
        "com.kubekthecreator.airbnb_clone_back.user.repository",
        "com.kubekthecreator.airbnb_clone_back.listing.repository",
        "com.kubekthecreator.airbnb_clone_back.booking.repository"})
@EnableTransactionManagement
@EnableJpaAuditing
public class DatabaseConfiguration {
}
