package id.co.swamedia.workshop.pointservice.controller;

import id.co.swamedia.workshop.pointservice.entity.Action;
import id.co.swamedia.workshop.pointservice.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class ActionController {

    @Autowired
    private ActionService actionService;

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public String save(@RequestBody Action action){
        actionService.save(action);
        return "SUKSES CREATE DATA";
    }
}
