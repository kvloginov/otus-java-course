package ru.otus.hw13.core.sessionmanager;

public interface SessionManager extends AutoCloseable {
    void beginSession();

    void commitSession();

    void rollbackSession();

    void close();

    DatabaseSession getCurrentSession();
}
