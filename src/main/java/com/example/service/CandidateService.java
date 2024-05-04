package com.example.service;



import com.example.model.Candidate;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class CandidateService {

    @PersistenceContext
    private EntityManager em;

    public List<Candidate> findById(String name) {
        Query q = em.createNativeQuery("SELECT * FROM Candidate p WHERE p.name LIKE '%" + name + "%'", Candidate.class);
        List<Candidate> candidateList = q.getResultList();
        return candidateList;
    }

}
