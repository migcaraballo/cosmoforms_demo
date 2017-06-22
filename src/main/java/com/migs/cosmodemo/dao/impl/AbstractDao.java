package com.migs.cosmodemo.dao.impl;

import com.migs.cosmodemo.dao.Dao;
import org.bson.types.ObjectId;

import java.util.Map;

/**
 * Created by mig.c on 6/22/17.
 */

public abstract class AbstractDao implements Dao {

    protected void decodeId(Map<String, Object> doc){
        doc.put("_id", doc.get("_id").toString());
    }

    protected void encodeId(Map<String, Object> doc){
        doc.put("_id", new ObjectId((String)doc.get("_id")));
    }

}
