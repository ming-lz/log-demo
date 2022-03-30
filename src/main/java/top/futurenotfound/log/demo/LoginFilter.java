package top.futurenotfound.log.demo;

import lombok.AllArgsConstructor;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import top.futurenotfound.log.util.CurrentUser;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@Component
@Order(2)
@WebFilter(urlPatterns = "/*")
@AllArgsConstructor
public class LoginFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        //模拟jwt解析
        CurrentUser.set("u001");
        chain.doFilter(request, response);
    }
}
