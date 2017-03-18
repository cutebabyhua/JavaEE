import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by jinhua.chen on 17/3/16.
 */
public class TimeServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /*
        1 使用request 接收请求数据 */
//        1.1 接收请求行
        System.out.println("请求类型:"+req.getMethod());
        System.out.println("Servlet路径:"+req.getServletPath());
        System.out.println("协议类型:"+req.getProtocol());

//        1.2 接收消息头 (消息头中的数据按照键值对来存储,是可以遍历的)
//        headNames是key的迭代器
        Enumeration<String> e = req.getHeaderNames();
        while(e.hasMoreElements()){
            String key = e.nextElement();
            String value = req.getHeader(key);
            System.out.println(key + ":"+ value);
        }

//        1.3 接收实体内容(本次请求没有发送业务数据,所以实体内容为空)




          /*
          2 使用response发送响应数据
          2.1 设置状态行 (该数据有Tomcat自动设置)
          2.2 设置消息头 ( 通知浏览器:给你传一个文本,文本格式是html)
           */

        resp.setContentType("text/html");
//      2.3 设置实体内容
//        谁访问tomcat,Tomcat就用一个流输出
        PrintWriter out = resp.getWriter();
        out.println("<h1>hello</h1>");
        out.close();
    }
}
