package ru.mail.ilya6697089.app.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ru.mail.ilya6697089.app.service.TableService;
import ru.mail.ilya6697089.app.service.impl.TableServiceImpl;

public class MenuServlet extends HttpServlet {

    private static final String PAGES = "/WEB-INF/pages";
    private TableService tableService = TableServiceImpl.getInstance();

    @Override
    public void init() {
        tableService.deleteAllTables();
        tableService.createAllTables();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(PAGES + "/index.jsp");

        requestDispatcher.forward(req, resp);
    }

}
