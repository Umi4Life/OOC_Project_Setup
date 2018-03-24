package io.ooc.project.Service;

import io.ooc.project.Model.billable;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * Created by Havensbee on 3/19/18.
 */
public interface BillableServiceTest {
    public List<billable> getAll();

    public billable get(Integer billableId);

    public billable getBillableByName(String billableName);

    public void add(billable bill);

    public void delete(Integer billableId);

    public void edit(billable bill);
}
