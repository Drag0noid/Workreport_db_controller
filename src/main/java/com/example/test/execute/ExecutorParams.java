package com.example.test.execute;

import com.example.test.model.connectDb.ConnectDbParams;

public class ExecutorParams<T extends ConnectDbParams> {
    final T params;

    public ExecutorParams (T params) {
        this.params = params;
    }

    public T getWrappedParams() {
        return params;
    }
}
