package com.bac.bacrow.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bac.bacrow.dao.intf.CIDao;
import com.bac.bacrow.domain.CI;
import com.bac.bacrow.domain.CIRelation;

@Repository
public class JpaCIDao implements CIDao {
	
	@PersistenceContext
	EntityManager em;

	public CI findbyCINum(String cinum) {	
		
		return (CI) em.createQuery("SELECT x from CI as x where x.cinum=:cinum").setParameter("cinum", cinum).getSingleResult();
	}
	
	
	
	public void save(CI ci){
		
	}


	public Collection<CI> findbyCIType(String type) {
		/**
		Collection<CI> set = template.query(
			    "select cinum, type,location,label from t_ci where type = ?",
			    new Object[]{type},
			    new RowMapper<CI>() {
			    	
			        public CI mapRow(ResultSet rs, int rowNum) throws SQLException {
			            CI obj = new CI();
			            obj.setCinum(rs.getString("cinum"));
			            obj.setLabel(rs.getString("label"));
			            obj.setLocation(rs.getString("location"));
			            obj.setType(rs.getString("type"));
			            return obj;
			        }
			    });
		return set;
		*/
		return null;
	}

	public Collection<CI> findbyCILocation(String location) {
		/**
		Collection<CI> set = template.query(
			    "select cinum, type,location,label from t_ci where location = ?",
			    new Object[]{location},
			    new RowMapper<CI>() {
			    	
			        public CI mapRow(ResultSet rs, int rowNum) throws SQLException {
			            CI obj = new CI();
			            obj.setCinum(rs.getString("cinum"));
			            obj.setLabel(rs.getString("label"));
			            obj.setLocation(rs.getString("location"));
			            obj.setType(rs.getString("type"));
			            return obj;
			        }
			    });
		return set;
		*/
		return null;
	}

	public Collection<CI> findbyCILabel(String label) {
		/**
		Collection<CI> set = template.query(
			    "select cinum, type,location,label from t_ci where label = ?",
			    new Object[]{label},
			    new RowMapper<CI>() {
			    	
			        public CI mapRow(ResultSet rs, int rowNum) throws SQLException {
			            CI obj = new CI();
			            obj.setCinum(rs.getString("cinum"));
			            obj.setLabel(rs.getString("label"));
			            obj.setLocation(rs.getString("location"));
			            obj.setType(rs.getString("type"));
			            return obj;
			        }
			    });
		return set;
		*/
		return null;
		
	}

	public Collection<CI> findRelatedCIset(String parent) {
		/**
		Collection<CIRelation> relSet = template.query(
			    "select parentci, childci,relname,direction from t_cirelation where parent = ?",
			    new Object[]{parent},
			    new RowMapper<CIRelation>() {
			    	
			        public CIRelation mapRow(ResultSet rs, int rowNum) throws SQLException {
			            CIRelation obj = new CIRelation();
			            obj.setParentci(rs.getString("parentci"));
			            obj.setChildci(rs.getString("childci"));
			            obj.setRelname(rs.getString("relname"));
			            obj.setDirection(rs.getString("direction"));
			            return obj;
			        }
			    });
		
		Collection<CI> ciset = new ArrayList<CI>();
		CI ci = null;
				
		for(CIRelation cirelobj:relSet){
			ci = findbyCINum(cirelobj.getParentci());
			ciset.add(ci);
		}
			
		return (ciset!=null && !ciset.isEmpty())? ciset:null;
		*/
		
		return null;
		
	}

}
