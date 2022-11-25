package com.davelpz.rweb;

import javax.ws.rs.ApplicationPath;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;

import static org.reflections.scanners.Scanners.TypesAnnotated;

@ApplicationPath("/rest")
public class Application extends javax.ws.rs.core.Application {
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
    Reflections reflections = new Reflections("com.davelpz");

    public Application() {
        LOGGER.info("Starting Appplication");
    }

    @Override
    public Set<Class<?>> getClasses() {
        LOGGER.info("Entering getClasses");
        return reflections.get(TypesAnnotated.with(javax.ws.rs.Path.class).asClass());
    }
}
