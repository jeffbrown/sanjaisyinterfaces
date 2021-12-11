package sanjaisyinterfaces;

public interface IServiceBus<C, R> {
    R send(C c);
}
