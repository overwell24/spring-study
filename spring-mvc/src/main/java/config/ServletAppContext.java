package config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import database.FreeboardMapper;

@Configuration // 스프링 설정 클래스 선언
@EnableWebMvc // Spring MVC를 활성화
@PropertySource("WEB-INF/properties/db.properties") // 프로퍼티 파일의 위치를 지정
@ComponentScan("controller") // 지정된 패키지를 스캔하여 스프링 빈으로 등록
public class ServletAppContext implements WebMvcConfigurer {
    
    // 프로퍼티 파일에서 값을 주입받습니다.
    @Value("${db.classname}")
    private String db_classname;
    
    @Value("${db.url}")
    private String db_url;
    
    @Value("${db.username}")
    private String db_username;
    
    @Value("${db.password}")
    private String db_password;
    
    // JSP 뷰 리졸버를 설정
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        WebMvcConfigurer.super.configureViewResolvers(registry);
        registry.jsp("/WEB-INF/views/", ".jsp");
    }

    // 정적 리소스 핸들러 설정
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        WebMvcConfigurer.super.addResourceHandlers(registry);
        registry.addResourceHandler("/**").addResourceLocations("/resources/");
    }
    
    // 데이터 소스 빈을 설정합니다.
    @Bean
    public BasicDataSource dataSource() {
        BasicDataSource source = new BasicDataSource();
        source.setDriverClassName(db_classname); // 드라이버 클래스 이름 설정
        source.setUrl(db_url); // 데이터베이스 URL 설정
        source.setUsername(db_username); // 데이터베이스 사용자 이름 설정
        source.setPassword(db_password); // 데이터베이스 비밀번호 설정

        return source;
    }
    
    // MyBatis의 SqlSessionFactory 빈 설정
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource source) throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(source); // 데이터 소스를 설정
        SqlSessionFactory factory = factoryBean.getObject(); // SqlSessionFactory 생성
        return factory;
    }
    
    // FreeboardMapper의 MapperFactoryBean 설정
    @Bean
    public MapperFactoryBean<FreeboardMapper> freeboard_mapper(SqlSessionFactory factory) {
        MapperFactoryBean<FreeboardMapper> factoryBean = new MapperFactoryBean<FreeboardMapper>(FreeboardMapper.class);
        factoryBean.setSqlSessionFactory(factory); // SqlSessionFactory 설정
        return factoryBean;
    }
}
