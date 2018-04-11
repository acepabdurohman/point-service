package id.co.swamedia.workshop.pointservice.service;

import id.co.swamedia.workshop.pointservice.dto.TransactionPointRequest;

public interface TransactionPointService {

    void save(TransactionPointRequest request);
}
