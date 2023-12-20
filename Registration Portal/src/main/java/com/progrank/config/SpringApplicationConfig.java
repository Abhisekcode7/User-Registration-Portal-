package com.progrank.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.progrank")
public class SpringApplicationConfig  implements WebMvcConfigurer{

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// TODO Auto-generated method stub
		registry.jsp("WEB-INF/jsp/",".jsp");
	}
	@Override
		public void addResourceHandlers(ResourceHandlerRegistry registry) {
			// TODO Auto-generated method stub
			registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/static/");
		}
      @Bean
      DriverManagerDataSource getDataSource() {
    	  DriverManagerDataSource ds = new DriverManagerDataSource();
    	  ds.setDriverClassName("com.mysql.jdbc.Driver");
    	  ds.setUrl("jdbc:mysql://localhost:3306/wordcount");
    	  ds.setUsername("root");
    	  ds.setPassword("Abhisek@1Abhi");
    	  return ds;
      }
      @Bean
      public JdbcTemplate jdbcTemplate() {
    	  return new JdbcTemplate((javax.sql.DataSource) getDataSource());
      }
}
