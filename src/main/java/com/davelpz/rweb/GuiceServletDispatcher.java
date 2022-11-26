package com.davelpz.rweb;

import org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher;

import javax.servlet.annotation.WebServlet;

@WebServlet("/rest/*")
public class GuiceServletDispatcher extends HttpServletDispatcher {
}
