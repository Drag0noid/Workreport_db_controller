package com.example.test.execute;

import com.example.test.execute.repo.pg_procExecute;
import com.example.test.model.connectDb.ConnectDbParams;

public class DBExecHandler<T> {
    public DBExecHandler(Class<pg_procExecute> ExecutorParams<? extends ConnectDbParams> params) {

        this.params = params;
    }
}
