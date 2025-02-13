package org.example;

public class Counter implements AutoCloseable {
    private int count = 0;
    private boolean closed = false;

    public void add() {
        if (closed) {
            throw new IllegalStateException("Counter is closed");
        }
        count++;
    }

    @Override
    public void close() throws Exception {
        closed = true;
    }
}
