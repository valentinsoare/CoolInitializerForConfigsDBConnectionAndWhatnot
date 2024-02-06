
package io.moviesondemand.projects.app.configs;

import io.moviesondemand.projects.annotations.InitializerClass;
import io.moviesondemand.projects.annotations.InitializerMethod;

@InitializerClass
public class ConfigsLoader {

    @InitializerMethod
    public void loadAllConfigs() {
        System.out.println("Loading all configuration files");
    }
}
