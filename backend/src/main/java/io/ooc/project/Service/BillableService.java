//package io.ooc.project.Service;
//
//import io.ooc.project.Model.*;
//import org.hibernate.Criteria;
//import org.hibernate.Query;
//import org.hibernate.Session;
//import org.hibernate.criterion.Restrictions;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Service("billableService")
//@Transactional
//public class BillableService {
//
//
//	public List<Billable> getAll(){
//		Session session = sessionFactory.getCurrentSession();
//		Query query = session.createQuery("FROM Billable");
//		return query.list();
//	}
//
//	public Billable get(Integer billableId){
//		Session session = sessionFactory.getCurrentSession();
//		return (Billable)session.get(Billable.class,billableId);
//	}
//
//	public Billable getBillableByName(String billableName){
//		Session session = sessionFactory.getCurrentSession();
//		Criteria criteria = session.createCriteria(Billable.class);
//		criteria.add(Restrictions.like("billableName",billableName));
//
//		Object result = criteria.uniqueResult();
//		Billable bill = (Billable) result;
//
//		return bill;
//
//	}
//
//	public void add(Billable bill) {
//		Session session = sessionFactory.getCurrentSession();
//		session.save(bill);
//	}
//
//	public void delete(Integer billableId){
//		Session session = sessionFactory.getCurrentSession();
//		Billable bill = (Billable)session.get(Billable.class,billableId);
//		session.delete(bill);
//	}
//
//	public void edit(Billable bill){
//		Session session = sessionFactory.getCurrentSession();
//		Billable bill2 = (Billable)session.get(Billable.class,bill.getBillableId());
//
//		bill2.setBillableName(bill.getBillableName());
//		bill2.setBillableAddress(bill.getBillableAddress());
//		session.save(bill2);
//	}
//
//}
//
