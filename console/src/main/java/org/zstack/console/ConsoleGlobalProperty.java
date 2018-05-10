package org.zstack.console;

import org.zstack.core.GlobalProperty;
import org.zstack.core.GlobalPropertyDefinition;

/**
 */
@GlobalPropertyDefinition
public class ConsoleGlobalProperty {
    @GlobalProperty(name="ConsoleProxy.agentPackageName", defaultValue = "consoleproxy-2.4.0.tar.gz")
    public static String AGENT_PACKAGE_NAME;
}
