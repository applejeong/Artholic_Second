package kr.co.two.sales.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.two.sales.dao.salesDAO;

@Service
public class salesService {

	@Autowired salesDAO dao;
	
	Logger logger = LoggerFactory.getLogger(getClass());
}
