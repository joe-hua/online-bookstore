package com.huaqx.config;

import org.springframework.web.servlet.HandlerInterceptor;

public class LoginHandlerInterceptor implements HandlerInterceptor{
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        Object loginuser = request.getSession().getAttribute("loginuser");
//        if(loginuser == null){
//            request.setAttribute("msg","没有登陆，请先登录");
////            返回到指定的页面
//            request.getRequestDispatcher("/index").forward(request,response);
//            return false;
//        }else {
//            return true;
//        }
//
//    }

}
