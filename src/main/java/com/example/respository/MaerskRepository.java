package com.example.respository;

import org.springframework.stereotype.Repository;

import com.example.bean.MaerskBean;

@Repository
public class MaerskRepository {
	
	public MaerskBean save(MaerskBean maerskBean) {
		return maerskBean;
	}
}
