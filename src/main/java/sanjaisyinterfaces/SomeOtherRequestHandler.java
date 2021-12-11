package sanjaisyinterfaces;

import jakarta.inject.Singleton;

@Singleton
public class SomeOtherRequestHandler implements IRequestHandler<SomeOtherCommandType, SomeOtherReturnType> {

    @Override
    public SomeOtherReturnType handler(SomeOtherCommandType someCommandType) {
        System.out.println("SomeOtherRequestHandler is handling a request for SomeOtherCommandType");
        // do whatever needs to be done here
        return null;
    }

    @Override
    public Class getCmdType() {
        return SomeOtherCommandType.class;
    }
}
