package springmvc.config;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Configuration
@EnableJpaRepositories(basePackages = "springmvc.repository")
@EnableTransactionManagement
public class SpringConfig {
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/ecommerce_shop1?useSSL=false&serverTimezone=UTC");
		ds.setUsername("root");
		ds.setPassword("Duc29092001#");
		return ds;
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource ds) {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(ds);
		em.setPackagesToScan("springmvc.entity");
		em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		
		Properties pr = new Properties();
		pr.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		pr.put("hibernate.hbm2ddl.auto", "update");
		
		em.setJpaProperties(pr);
		return em;
	}
	
//	@Bean
//	public EntityManager entityManager(EntityManagerFactory entityManagerFactory) {
//	    return entityManagerFactory.createEntityManager();
//	}
//
//	@Bean
//	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//	    LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
//	    em.setDataSource(dataSource());
//	    em.setPackagesToScan("springmvc.entity");
//	    JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//	    em.setJpaVendorAdapter(vendorAdapter);
//	    em.setJpaProperties(additionalProperties());
//	    return em;
//	}
//	Properties additionalProperties() {
//        Properties properties = new Properties();
//        properties.setProperty("hibernate.hbm2ddl.auto", "update");
//        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
//        return properties;
//    }
//	
	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager tm = new JpaTransactionManager(entityManagerFactory);
		return tm;
	}
	
	@Bean
	public CommonsMultipartResolver multipartResolver() {
	CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
	multipartResolver.setMaxUploadSize(268435456);
	return multipartResolver;
	}
	
	//@Bean
//	public JavaMailSender getJavaMailSender() {
//		JavaMailSenderImpl mailsender = new JavaMailSenderImpl();
//		mailsender.setHost("smtp.gmail.com");
//		mailsender.setPort(587);
//		
//		mailsender.setUsername("thaidinhduc111@gmail.com");
//		mailsender.setPassword("Duc29092001#");
//		
//		Properties props = mailsender.getJavaMailProperties();
//		props.put("mail.transpot.protocol", "smtp");
//		props.put("mail.smtp.auth", "true");
//		props.put("mail.smtp.starttls.enable", "true");
//		props.put("mail.debug", "smtp");
//		return mailsender;
//	}
}
