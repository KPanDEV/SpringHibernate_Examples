package com.pankaj.spring.spring_hibernateExamples.hibernateConfiguration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@PropertySource(value = {"classpath:application.properties"})
@ComponentScan({"com.pankaj.spring.spring_hibernateExamples.hibernateConfiguration"})
public class HibernateConfiguration {
	
	@Autowired
	private Environment environment;
	
	@Bean
	public LocalSessionFactoryBean sessionFactorybean()
	{
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(new String [] {"com.pankaj.spring.spring_hibernateExamples.model"});
		sessionFactory.setHibernateProperties(hibernateProperties());
		return sessionFactory;
		
	}
	
	
	@Bean
	public DataSource dataSource()
	{
	 DriverManagerDataSource dataSource = new  DriverManagerDataSource();
	 dataSource.setDriverClassName(environment.getProperty("jdbc.driverClassName"));
	 dataSource.setUrl(environment.getProperty("jdbc.url"));
	 dataSource.setUsername(environment.getProperty("jdbc.username"));
	 dataSource.setPassword(environment.getProperty("jdbc.password"));
	 return dataSource;
	 
	}
	
	
	private Properties hibernateProperties()
	{
		Properties properties = new Properties();
		properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
		properties.put("hibernate.show_sql",environment.getProperty("hibernate.show_sql"));
		properties.put("hibernate.format_sql",environment.getProperty("hibernate.format_sql"));
		return properties;
	}
	
	
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory sf)
	{
		HibernateTransactionManager hTxnManager = new HibernateTransactionManager();
		hTxnManager.setSessionFactory(sf);
		return hTxnManager;
	}
	
	

}
