package org.fasttrackit.web;
import org.fasttrackit.service.TaskService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/tasks")
public class TaskServlet extends HttpServlet {

    private TaskService taskService = new TaskService();
//endPoint
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException{

    }

}
