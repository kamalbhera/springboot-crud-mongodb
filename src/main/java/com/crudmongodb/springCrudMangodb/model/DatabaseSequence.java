package com.crudmongodb.springCrudMangodb.model;

import org.springframework.data.annotation.Id;

public class DatabaseSequence {

    @Id
    private String id;

    private long seq;

    public DatabaseSequence(String id, long seq) {
        this.id = id;
        this.seq = seq;
    }

    public String getId() {
        return id;
    }

    public long getSeq() {
        return seq;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSeq(long seq) {
        this.seq = seq;
    }
}
