package com.bac.bacrow.dao.intf;

import java.util.Collection;

import com.bac.bacrow.domain.CI;



public interface CIDao {

	public CI findbyCINum(String cinum);
	public Collection<CI> findbyCIType(String type);
	public Collection<CI> findbyCILocation(String location);
	public Collection<CI> findbyCILabel(String label);
	public Collection<CI> findRelatedCIset(String cinum);
	public void save(CI ci);
}
