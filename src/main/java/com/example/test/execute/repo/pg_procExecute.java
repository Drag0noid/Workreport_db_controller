package com.example.test.execute.repo;

import com.example.test.db.DBType;
import com.example.test.execute.ExecutorParams;
import com.example.test.model.request.RequestPg_proc;

import java.lang.reflect.Array;

public class pg_procExecute {

    final RequestPg_proc params;
    String query;

    public pg_procExecute(ExecutorParams<RequestPg_proc> params) {

        this.params = params.getWrappedParams();
    }

    void defineQueries () {
        String proname = params.proname();
        Array pronamespace = params.pronamespace();

        if (dbType == DBType.POSTGRES) {
            query = "   SELECT\n" +
                    "    proname,\n" +
                    "    proargtypes,\n" +
                    "    prorettype,\n" +
                    "    proargmodes,\n" +
                    "    proargnames\n" +
                    "FROM\n" +
                    "    \t\n" +
                    "WHERE\n" +
                    "    proname = '"+ proname +"' AND pronamespace = '"+ pronamespace +"'::regnamespace;";

        } else if (dbType == DBType.ORACLE) {
            throw new RuntimeException("For DBType = " + dbType.name() + " query is not defined!");
        } else {
            throw new RuntimeException("For DBType = " + dbType.name() + " query is not defined!");
        }
    }
}
