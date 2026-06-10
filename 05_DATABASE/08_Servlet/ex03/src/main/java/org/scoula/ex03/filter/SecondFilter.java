package org.scoula.ex03.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/*
* Filter
* - 클라이언트 요청이 Servlet / JSP에 도착 하기 전 / 응답이 나가기 전에 공통 처리를 할 수 있는 컴포넌트
* */

@WebFilter(urlPatterns = {"/*"}) // 모든 요청에 대해 필터를 고치게 함
public class SecondFilter implements Filter {

    // filter가 생성될 때 동작
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        // Servlet 호출 전(전처리)
        System.out.println("필터2 동작 시작");
        request.setCharacterEncoding("UTF-8");

        chain.doFilter(request, response); // 다음 필터 또는 서블릿으로 요청 전달

        // 클라이언트 응답하기 전(후처리)
        System.out.println("필터2 동착 끝");
    }

    // 서버가 종료될떄
    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
