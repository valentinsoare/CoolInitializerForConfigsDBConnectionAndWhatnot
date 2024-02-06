
package io.moviesondemand.projects.app.saver;

import io.moviesondemand.projects.annotations.InitializerClass;
import io.moviesondemand.projects.annotations.InitializerMethod;

@InitializerClass
public class AutoSaver {

    @InitializerMethod
    public void startAutoSavingThreads() {
        System.out.println("Start automatic data saving to disk");
    }
}
