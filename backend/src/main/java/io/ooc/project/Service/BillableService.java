package io.ooc.project.Service;

import io.ooc.project.Model.Billable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface BillableServiceInterface {
    public List<Billable> getAll();

    public Billable get(Integer billableId);

    public Billable getBillableByName(String billableName);

    public void add(Billable bill) ;

    public void delete(Integer billableId);

}
