package com.example.test.execute;

import com.example.test.model.connectDb.ConnectDbParams;
import com.example.test.db.DBType;

public abstract class DBExecutor<T> {

    final ConnectDbParams params;
    protected final DBType dbType;

    public DBExecutor(ExecutorParams<? extends ConnectDbParams> executorParams) {
        this.params = executorParams.getWrappedParams();
        this.dbType = DBType.defineByUrl(params.getUrl());
    }
}
