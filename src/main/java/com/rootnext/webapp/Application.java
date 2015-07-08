package com.rootnext.webapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 * Created by sanjoy on 7/7/15.
 */
@Configuration
public class Application {

//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/spring_webapp");
//        dataSource.setUsername("root");
//        dataSource.setPassword("admin");
//        return dataSource;
//    }
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//
//        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//
//        entityManagerFactoryBean.setDataSource(dataSource());
//        entityManagerFactoryBean.setPersistenceUnitName("persistanceUnit");
//        entityManagerFactoryBean.setPackagesToScan("com.rootnext.webapp.models");
//        entityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter());
//
//        Properties properties = new Properties();
//        properties.setProperty("hibernate.hbm2ddl.auto", "update");
//        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
//        properties.setProperty("hibernate.ejb.entitymanager_factory_name", "emPersistenceUnit");
////        properties.setProperty("hibernate.show_sql", "true");
////        properties.setProperty("hibernate.format_sql", "true");
//        entityManagerFactoryBean.setJpaProperties(properties);
//
//        entityManagerFactoryBean.afterPropertiesSet();
//        return entityManagerFactoryBean;
//    }
//
//    @Bean
//    public JpaVendorAdapter jpaVendorAdapter() {
//        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
//
//        jpaVendorAdapter.setDatabase(Database.MYSQL);
////        jpaVendorAdapter.setGenerateDdl(true);
////        jpaVendorAdapter.setShowSql(true);
//        jpaVendorAdapter.setDatabasePlatform("org.hibernate.dialect.MySQL5Dialect");
//
//        return jpaVendorAdapter;
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager() {
//        JpaTransactionManager transactionManager = new JpaTransactionManager();
//
//        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
//
//        return transactionManager;
//    }
//
//    @Bean
//    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
//
//        return new PersistenceExceptionTranslationPostProcessor();
//
//    }

    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();

    }

}
