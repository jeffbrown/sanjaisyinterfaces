package sanjaisyinterfaces;

import jakarta.inject.Singleton;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

@Singleton
public class ServiceBus implements IServiceBus {

    private final Map<Class<?>, IRequestHandler<?, ?>> handlerMap;

    public ServiceBus(List<IRequestHandler<?, ?>> handlers) {
        handlerMap = handlers.stream()
                .collect(toMap(
                        IRequestHandler::getCmdType,
                        Function.identity()
                ));
    }

    @Override
    public Object send(CommandType c) {
        IRequestHandler handler = handlerMap.get(c.getClass());
        if (handler == null)
            throw new UnsupportedOperationException("Unsupported command: " + c.getClass());
        return handler.handler(c);
    }
}
