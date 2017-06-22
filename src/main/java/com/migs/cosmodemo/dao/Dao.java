package com.migs.cosmodemo.dao;

import java.util.List;
import java.util.Map;

/**
 * Created by migc on 5/25/17.
 */

public interface Dao {

	List<Map<String, Object>> findAll();
	Map<String, Object> findById(String id);
	boolean updateDoc(String id, Map<String, Object> docMap);
	boolean insertDoc(Map<String, Object> docMap);
}
