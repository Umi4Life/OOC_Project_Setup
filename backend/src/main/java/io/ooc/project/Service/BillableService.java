package io.ooc.project.Service;

import io.ooc.project.Model.*;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("billableService")
@Transactional
public class BillableService {
	
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	public List<billable> getAll(){
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("FROM billable");
		return query.list();
	}
	
	public billable get(Integer billableId){
		Session session = sessionFactory.getCurrentSession();
		return (billable)session.get(billable.class,billableId);
	}
	
	public billable getBillableByName(String billableName){
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(billable.class);
		criteria.add(Restrictions.like("billableName",billableName));
		
		Object result = criteria.uniqueResult();
		billable bill = (billable) result;
		
		return bill;
		
	}
	
	public void add(billable bill) {
		Session session = sessionFactory.getCurrentSession();
		session.save(bill);
	}
	
	public void delete(Integer billableId){
		Session session = sessionFactory.getCurrentSession();
		billable bill = (billable)session.get(billable.class,billableId);
		session.delete(bill);
	}

	public void edit(billable bill){
		Session session = sessionFactory.getCurrentSession();
		billable bill2 = (billable)session.get(billable.class,bill.getBillableId());
		
		bill2.setBillableName(bill.getBillableName());
		bill2.setBillableAddress(bill.getBillableAddress());
		session.save(bill2);
	}
	
}

