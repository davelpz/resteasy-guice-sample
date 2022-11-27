package com.davelpz.rweb;

import com.google.inject.Injector;
import org.jboss.resteasy.plugins.guice.GuiceResteasyBootstrapServletContextListener;
import com.google.inject.Module;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import java.util.Arrays;
import java.util.List;

@WebListener
public class GuiceServletContextListener extends GuiceResteasyBootstrapServletContextListener {
    @Override
    protected List<? extends Module> getModules(ServletContext context)
    {
        return Arrays.asList(new RestModule());
    }

    @Override
    public void withInjector(Injector injector)
    {
        //injector.getInstance(PersistService.class).start();
    }
}
