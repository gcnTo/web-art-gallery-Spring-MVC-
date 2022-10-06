package com.gcnto.artgallery.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gcnto.artgallery.entity.Art;

@Repository
public class ArtDAOImpl implements ArtDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Art> accessArtList() {
		
		Session currentSession = sessionFactory.getCurrentSession();

		Query<Art> queryArt = currentSession.createQuery("from Art", Art.class);

		List<Art> artList = queryArt.getResultList();
		
		for (Art a : artList) {
			
			System.out.println(a.getReviewList());
			
		}

		return artList;
	}

}
