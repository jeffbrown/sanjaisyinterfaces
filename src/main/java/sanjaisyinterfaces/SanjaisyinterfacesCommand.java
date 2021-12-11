package sanjaisyinterfaces;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;

import jakarta.inject.Inject;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "sanjaisyinterfaces", description = "...",
        mixinStandardHelpOptions = true)
public class SanjaisyinterfacesCommand implements Runnable {

    @Inject
    ServiceBus serviceBus;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(SanjaisyinterfacesCommand.class, args);
    }

    public void run() {
        SomeCommandType firstCommand = new SomeCommandType();
        SomeOtherCommandType secondCommand = new SomeOtherCommandType();
        serviceBus.send(firstCommand);
        serviceBus.send(secondCommand);
    }
}
