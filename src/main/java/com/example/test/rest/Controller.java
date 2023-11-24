package com.example.test.rest;

import com.example.test.Service.Pg_procService;
import com.example.test.model.request.RequestPg_proc;
import com.example.test.model.response.ResponsePg_proc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/show")
@RestController
public class Controller {

    protected final Pg_procService pg_procService;

    @Autowired
    public Controller(Pg_procService pg_procService) {
        this.pg_procService = pg_procService;
    }

    @PostMapping(path = "/pg_proc")
    @ResponseBody
    public ResponseEntity<?> getTableColumns(@RequestBody RequestPg_proc request) {
        List<ResponsePg_proc> response = pg_procService.getTableColumns(request);
        return ResponseEntity.ok(response);
    }
}
