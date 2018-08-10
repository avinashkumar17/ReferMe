package com.example.demo;

import java.util.List;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Company;

@Repository
public class DaoImpl {
@Autowired
private SessionFactory factory;

@Transactional
public List<Company> getList() {
	// TODO Auto-generated method stub
	Session s =	factory.getCurrentSession();	
	List<Company> cc=s.createQuery("from Company e").getResultList();
	return cc;
}

	
	
}
