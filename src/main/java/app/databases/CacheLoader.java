
package io.moviesondemand.projects.app.databases;

import io.moviesondemand.projects.annotations.InitializerClass;
import io.moviesondemand.projects.annotations.InitializerMethod;

@InitializerClass
public class CacheLoader {

    @InitializerMethod
    public void loadCache() {
        System.out.println("Loading data from cache");
    }

    public void reloadCache() {
        System.out.println("Reload cache");
    }
}
