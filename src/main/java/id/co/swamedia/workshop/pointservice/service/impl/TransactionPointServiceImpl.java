package id.co.swamedia.workshop.pointservice.service.impl;

import id.co.swamedia.workshop.pointservice.dto.TransactionPointRequest;
import id.co.swamedia.workshop.pointservice.entity.Action;
import id.co.swamedia.workshop.pointservice.entity.TransactionPoint;
import id.co.swamedia.workshop.pointservice.repository.ActionRepository;
import id.co.swamedia.workshop.pointservice.repository.TransactionPointRepository;
import id.co.swamedia.workshop.pointservice.service.TransactionPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TransactionPointServiceImpl implements TransactionPointService {

    @Autowired
    private TransactionPointRepository transactionPointRepository;

    @Autowired
    private ActionRepository actionRepository;

    @Override
    public void save(TransactionPointRequest request) {
        Integer actionId = request.getActionId();
        Action action = actionRepository.findOne(actionId);
        TransactionPoint transactionPoint = new TransactionPoint();
        transactionPoint.setId(null);
        transactionPoint.setTanggal(new Date());
        transactionPoint.setAction(action);
        transactionPoint.setEmployeeId(request.getEmployeeId());
        transactionPointRepository.save(transactionPoint);
    }
}
