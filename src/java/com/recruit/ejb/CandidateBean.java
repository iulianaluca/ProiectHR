package com.recruit.ejb;

import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class CandidateBean {

    private static final Logger LOG = Logger.getLogger(CandidateBean.class.getName());

    @PersistenceContext
    private EntityManager em;
}
