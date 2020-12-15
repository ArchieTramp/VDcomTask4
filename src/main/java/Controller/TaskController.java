package Controller;

import Connection.ConnectionManagerJDBC;
import Method.AddToTable;
import Method.DeleteByTable;
import Method.EditInTable;
import Method.FindAllInTable;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/myservlet")
public class TaskController extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

        String button = request.getParameter("button");
        ConnectionManagerJDBC jdbc = new ConnectionManagerJDBC();


        if ("button1".equals(button)) {
            FindAllInTable.showBG(jdbc.getConnection());
        } else if ("button2".equals(button)) {
            FindAllInTable.showST(jdbc.getConnection());
        } else if ("button3".equals(button)) {
            AddToTable.add(jdbc.getConnection());
        } else if ("button4".equals(button)) {
            DeleteByTable.delete(jdbc.getConnection());
        } else if ("button5".equals(button)) {
            EditInTable.update(jdbc.getConnection());
        }


        request.getRequestDispatcher("/webapp/index.jsp").forward(request, response);
    }

}
