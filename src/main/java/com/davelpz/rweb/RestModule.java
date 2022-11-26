package com.davelpz.rweb;

import com.google.inject.AbstractModule;
import org.reflections.Reflections;

import java.util.Set;

import static org.reflections.scanners.Scanners.TypesAnnotated;

public class RestModule extends AbstractModule
{
    Reflections reflections = new Reflections("com.davelpz");

    public void configure()
    {
        Set<Class<?>> resources = reflections.get(TypesAnnotated.with(javax.ws.rs.Path.class).asClass());
        for (Class<?> cls: resources) {
            binder().bind(cls);
        }
        //binder.bind(Greeter.class).to(DefaultGreeter.class);
    }
}