package sanjaisyinterfaces;

public interface IRequestHandler<C extends CommandType, R> {
    R handler(C c);
    Class<C> getCmdType();
}
