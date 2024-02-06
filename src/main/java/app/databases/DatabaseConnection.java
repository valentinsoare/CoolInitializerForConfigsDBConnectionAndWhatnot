
package io.moviesondemand.projects.app.databases;

import io.moviesondemand.projects.annotations.InitializerClass;
import io.moviesondemand.projects.annotations.InitializerMethod;

@InitializerClass
public class DatabaseConnection {

    @InitializerMethod
    public void connectToDatabase1() {
        System.out.println("Connecting to database 1");
    }

    @InitializerMethod
    public void connectToDatabase2() {
        System.out.println("Connecting to database 2");
    }
}
