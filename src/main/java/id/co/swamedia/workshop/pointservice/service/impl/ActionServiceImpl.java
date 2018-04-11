package id.co.swamedia.workshop.pointservice.service.impl;

import id.co.swamedia.workshop.pointservice.entity.Action;
import id.co.swamedia.workshop.pointservice.repository.ActionRepository;
import id.co.swamedia.workshop.pointservice.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ActionServiceImpl implements ActionService{

    @Autowired
    private ActionRepository actionRepository;

    @Override
    public void save(Action action) {
        actionRepository.save(action);
    }
}
