package io.ooc.project.Service;

import io.ooc.project.Model.Billable;
import io.ooc.project.Repository.BillableRepository;
import io.ooc.project.Repository.CategoryRepository;
import io.ooc.project.Repository.ItemRepository;
import io.ooc.project.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Havensbee on 3/19/18.
 */
@Service("billableService")
@Transactional
public class BillableServiceImpl implements BillableServiceInterface {
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
