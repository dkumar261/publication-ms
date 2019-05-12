package com.publication.ms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.modelmapper.ModelMapper;

/**
 * ModelMapper configuration. Refer to documentation at http://modelmapper.org/
 * 
 * @author Dinesh Kumar
 */
@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper mapper() {
        ModelMapper modelMapper = new ModelMapper();
        
        // Configure the ModelMapper
        modelMapper.getConfiguration()
            .setDeepCopyEnabled(true)
            .setSkipNullEnabled(true);

        return modelMapper;
    }
}