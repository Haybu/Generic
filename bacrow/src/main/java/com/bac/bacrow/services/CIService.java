package com.bac.bacrow.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bac.bacrow.dao.intf.CIDao;
import com.bac.bacrow.domain.CI;
import com.bac.bacrow.services.intf.CIServicesInterface;


@Service
@Transactional
public class CIService implements CIServicesInterface {
	
	@Autowired
	CIDao cidao;

	public CI searchCI(String cinum) {
		return cidao.findbyCINum(cinum);
	}

	public Collection<CI> searchbyType(String type) {
		// TODO Auto-generated method stub
		return cidao.findbyCIType(type);
	}


	public TreeMap<CI,HashMap<CI,String[]>> getRelatedCIs(String cinum) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void addCI(CI ci){
		
	}

}
