package id.co.swamedia.workshop.pointservice.controller;

import id.co.swamedia.workshop.pointservice.dto.TransactionPointRequest;
import id.co.swamedia.workshop.pointservice.service.TransactionPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionPointCpntroller {

    @Autowired
    private TransactionPointService transactionPointService;

    @PostMapping("/transaction")
    @ResponseStatus(HttpStatus.CREATED)
    public String save(@RequestBody TransactionPointRequest request){
        transactionPointService.save(request);
        return "SUKSES CREATE DATA";
    }
}
