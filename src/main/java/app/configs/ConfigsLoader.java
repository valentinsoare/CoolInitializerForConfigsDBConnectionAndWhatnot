
package app.configs;

import annotations.InitializerClass;
import annotations.InitializerMethod;

@InitializerClass
public class ConfigsLoader {

    @InitializerMethod
    public void loadAllConfigs() {
        System.out.printf("%nLoading all configuration files");
    }
}
