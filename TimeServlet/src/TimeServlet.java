import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jinhua.chen on 17/3/16.
 */
public class TimeServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        写代码向浏览器输出一个HTML
//       通知浏览器给你 传一个文本,文本格式是html
        resp.setContentType("text/html");
//        谁访问tomcat,Tomcat就用一个流输出
        PrintWriter out = resp.getWriter();
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        String now = simpleDateFormat.format(date);
        out.println("<h1>"+now+"</h1>");
        out.close();
    }
}
