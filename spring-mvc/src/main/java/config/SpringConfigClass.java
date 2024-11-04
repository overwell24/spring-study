package config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// SpringConfigClass는 AbstractAnnotationConfigDispatcherServletInitializer를 확장하여
// 스프링 애플리케이션의 설정을 초기화합니다.
// 이 클래스는 web.xml의 설정을 대체합니다.
public class SpringConfigClass extends AbstractAnnotationConfigDispatcherServletInitializer{

    // 루트 컨텍스트 설정 클래스들을 반환합니다.
    @Override
    protected Class<?>[] getRootConfigClasses() {
        // RootAppContext 클래스를 루트 설정으로 사용합니다.
        // 이는 <context-param>과 <context:component-scan>을 대체합니다.
        return new Class[] { RootAppContext.class };
    }

    // 서블릿 컨텍스트 설정 클래스들을 반환합니다.
    @Override
    protected Class<?>[] getServletConfigClasses() {
        // ServletAppContext 클래스를 서블릿 설정으로 사용합니다.
        // 이는 <servlet>과 <servlet-mapping>을 대체합니다.
        return new Class[] { ServletAppContext.class };
    }

    // DispatcherServlet에 매핑할 URL 패턴을 지정합니다.
    @Override
    protected String[] getServletMappings() {
        // 애플리케이션의 모든 요청을 DispatcherServlet이 처리하도록 설정합니다.
        // 이는 <servlet-mapping>의 <url-pattern>을 대체합니다.
        return new String[] {"/"};
    }
    
    // 서블릿 필터들을 반환합니다.
    @Override
    protected Filter[] getServletFilters() {
        // 캐릭터 인코딩 필터를 설정하여 UTF-8 인코딩을 사용하도록 합니다.
        // 이는 <filter>와 <filter-mapping>을 대체합니다.
        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
        encodingFilter.setEncoding("UTF-8");
        return new Filter[] { encodingFilter };
    }
}
