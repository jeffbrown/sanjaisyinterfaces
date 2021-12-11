package sanjaisyinterfaces;

public interface IServiceBus {
    Object send(CommandType c);
}
