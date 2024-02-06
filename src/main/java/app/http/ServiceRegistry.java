
package io.moviesondemand.projects.app.http;

import io.moviesondemand.projects.annotations.InitializerClass;
import io.moviesondemand.projects.annotations.InitializerMethod;

@InitializerClass
public class ServiceRegistry {

    @InitializerMethod
    public void registerService() {
        System.out.println("Service successfully registered");
    }
}
