
package app.databases;

import annotations.InitializerClass;
import annotations.InitializerMethod;
import annotations.RetryOperation;

import java.io.IOException;

@InitializerClass
public class DatabaseConnection {
    private int failCounter = 5;

    @InitializerMethod
    @RetryOperation(
            retryExceptions = {IOException.class},
            durationBetweenRetriesMs = 1000,
            numberOfRetries = 10,
            failureMessage = "Connecting to database 1 failed after several retries were made!"
    )
    public void connectToDatabase1() throws IOException {
        System.out.printf("Connecting to database 1%n");

        if (failCounter > 0) {
            failCounter--;
            throw new IOException("Connection failed!");
        }

        System.out.printf("Connection to database 1 succeeded!");
    }

    @InitializerMethod
    public void connectToDatabase2() {
        System.out.printf("%nConnecting to database 2%n");
    }
}
