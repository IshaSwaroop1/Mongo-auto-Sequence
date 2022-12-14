package com.example.demo.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.example.demo.entity.DBSequence;

@Service
public class SequenceGeneratorService {
	@Autowired 
	private MongoOperations mongoOperations;
	
	
	public int getSequenceNumber(String sequenceName) {
		Query query=new Query(Criteria.where("id").is(sequenceName));
		Update update=new Update();update.inc("seq",1);
		FindAndModifyOptions options = new FindAndModifyOptions();
		options.returnNew(true).upsert(true);
		DBSequence counter = mongoOperations.findAndModify(query,update,options, DBSequence.class);
		return !Objects.isNull(counter) ? counter.getSeq() : 1;
}
}

