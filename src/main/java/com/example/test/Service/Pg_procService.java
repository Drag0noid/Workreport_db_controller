package com.example.test.Service;

import com.example.test.model.request.RequestPg_proc;
import com.example.test.model.response.ResponsePg_proc;
import com.example.test.repo.DBRepository;

import java.util.List;

public class Pg_procService {
    protected final DBRepository dbRepository;

    public Pg_procService(DBRepository dbRepository) {
        this.dbRepository = dbRepository;
    }

    public List<ResponsePg_proc> getTableColumns(RequestPg_proc params) {
        return dbRepository.getTableColumns(params);
    }
}
