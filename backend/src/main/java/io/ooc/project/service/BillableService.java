package io.ooc.project.service;

import io.ooc.project.model.Billable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface BillableService {
    List<Billable> getAll();

    Billable get(Integer billableId);

    Billable getBillableByName(String billableName);

    void add(Billable bill) ;

    void delete(Integer billableId);

}
