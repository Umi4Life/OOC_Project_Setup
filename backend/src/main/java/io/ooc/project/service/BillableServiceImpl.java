package io.ooc.project.service;

import io.ooc.project.model.Billable;
import io.ooc.project.repository.BillableRepository;
import io.ooc.project.repository.CategoryRepository;
import io.ooc.project.repository.ItemRepository;
import io.ooc.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Havensbee on 3/19/18.
 */
@Service("billableService")
@Transactional
public class BillableServiceImpl implements BillableService {
    @Autowired
    private BillableRepository billableRepository;

    @Override
    public List<Billable> getAll() {
        return billableRepository.findAll();
    }

    @Override
    public Billable get(Integer billableId) {
        return billableRepository.findByBillableId(billableId);
    }

    @Override
    public Billable getBillableByName(String billableName) {
        return billableRepository.findByBillableName(billableName);
    }

    @Override
    public void add(Billable bill) {
        billableRepository.save(bill);
    }

    @Override
    public void delete(Integer billableId) {
        billableRepository.delete((long)billableId);
    }

}
