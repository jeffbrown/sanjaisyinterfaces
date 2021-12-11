package sanjaisyinterfaces;

import jakarta.inject.Singleton;

@Singleton
public class SomeRequestHandler implements IRequestHandler<SomeCommandType, SomeReturnType> {

    @Override
    public SomeReturnType handler(SomeCommandType someCommandType) {
        System.out.println("SomeRequestHandler is handling a request for SomeCommandType");
        // do whatever needs to be done here
        return null;
    }

    @Override
    public Class getCmdType() {
        return SomeCommandType.class;
    }
}
