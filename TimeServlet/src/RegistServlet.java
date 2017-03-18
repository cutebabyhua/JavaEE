import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by jinhua.chen on 17/3/18.
 */
public class RegistServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("utf-8");
//        1 接收请求数据
        String name = req.getParameter("username");
        String passWorld = req.getParameter("passworld");
        String sex = req.getParameter("sex");
        String[] interests = req.getParameterValues("interest");

//        2 处理业务
        System.out.println(name);
        System.out.println(passWorld);
        System.out.println(sex);
        if (interests != null){
            for (String interest: interests){
                System.out.println(interest);
            }
        }

//        3 发送响应数据
        resp.setContentType("text/html;charset=utf-8");
        resp.setCharacterEncoding("utf-8");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<h1>注册成功</h1>");
        printWriter.close();
    }
}
