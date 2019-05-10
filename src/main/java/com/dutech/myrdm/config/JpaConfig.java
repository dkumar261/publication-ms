package com.dutech.myrdm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * JPA configuration, providing an AuditAware bean.
 * 
 * @author Dinesh Kumar
 */
@Configuration
@EnableTransactionManagement
//@EnableJpaRepositories(repositoryFactoryBeanClass = EnversRevisionRepositoryFactoryBean.class)
public class JpaConfig {

}
