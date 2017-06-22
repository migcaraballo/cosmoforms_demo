package com.migs.cosmodemo.dao.impl;

import com.migs.cosmodemo.dao.Dao;
import com.mongodb.Block;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by migc on 5/25/17.
 */

@Repository
public class PetsDao extends AbstractDao {

	private static String COLL = "pets";

	@Autowired
	private MongoDatabase md;

	@Override
	public List<Map<String, Object>> findAll() {
		List<Map<String, Object>> petsList = new ArrayList<>();

		md.getCollection(COLL).find().forEach((Block<Document>) doc -> {
			decodeId(doc);
			petsList.add(doc);
		});

		return petsList;
	}

	@Override
	public Map<String, Object> findById(String id) {
		Map<String, Object> doc = md.getCollection(COLL).find(Filters.eq("_id", new ObjectId(id))).first();
		decodeId(doc);
		return doc;
	}

	@Override
	public boolean updateDoc(String id, Map<String, Object> docMap) {
		encodeId(docMap);
		UpdateResult ur = md.getCollection(COLL).replaceOne(Filters.eq("_id", new ObjectId(id)), new Document(docMap));
		return ur.wasAcknowledged();
	}

	@Override
	public boolean insertDoc(Map<String, Object> docMap) {
		try {
			md.getCollection(COLL).insertOne(new Document(docMap));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
