import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VisitServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        res.setContentType("text/html");

        int count = 1;

        Cookie ck[] = req.getCookies();

        if (ck != null) {
            for (Cookie c : ck) {
                if (c.getName().equals("visits")) {
                    count = Integer.parseInt(c.getValue()) + 1;
                }
            }
        }

        // Set updated cookie
        Cookie visitCookie = new Cookie("visits", Integer.toString(count));
        visitCookie.setMaxAge(60 * 60 * 24); // 1 day
        res.addCookie(visitCookie);

        PrintWriter out = res.getWriter();
        out.println("<h2>You have visited this site " + count + " times.</h2>");
    }
}
