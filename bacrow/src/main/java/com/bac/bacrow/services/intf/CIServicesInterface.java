package com.bac.bacrow.services.intf;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import org.springframework.stereotype.Service;

import com.bac.bacrow.domain.CI;



public interface CIServicesInterface {
	
	public CI searchCI(String cinum);
	public Collection<CI> searchbyType(String type);
	public void addCI(CI ci);
	public TreeMap<CI,HashMap<CI,String[]>> getRelatedCIs(String cinum);

}
