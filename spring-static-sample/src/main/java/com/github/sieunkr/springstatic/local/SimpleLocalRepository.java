package com.github.sieunkr.springstatic.local;

import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import java.io.File;

@Repository
public class SimpleLocalRepository implements LocalRepository {

    @Override
    public void save(File file) {

    }

    @Override
    public File findOne(String bucket, String name) {

        Assert.notNull(bucket, "The bucket must not be null!");
        Assert.notNull(name, "The name must not be null!");

        return new File(bucket + name);
    }

    @Override
    public void deleteFile(String bucket, String name) {

    }

    @Override
    public void makeBucket(String bucket) {
        //TODO
    }
}
