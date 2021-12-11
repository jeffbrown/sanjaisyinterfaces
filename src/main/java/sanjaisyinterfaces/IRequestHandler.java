package sanjaisyinterfaces;

public interface IRequestHandler<C , R> {
    R handler(C c);
    Class<C> getCmdType();
}
