package com.example.test.repo;

import com.example.test.execute.DBExecHandler;
import com.example.test.execute.ExecutorParams;
import com.example.test.execute.repo.pg_procExecute;
import com.example.test.model.request.RequestPg_proc;
import com.example.test.model.response.ResponsePg_proc;

import java.util.List;

public class DBRepository {
    public List<ResponsePg_proc> getTableColumns(RequestPg_proc params){
        return new DBExecHandler<>(pg_procExecute.class, new ExecutorParams<>(params)).exec();
    }
}
