package com.github.sieunkr.springstatic.local;

import org.springframework.stereotype.Repository;

import java.io.File;

@Repository
public class SimpleLocalRepository implements LocalRepository {

    @Override
    public void save(File file) {

    }

    @Override
    public File findOne(String bucket, String name) {
        return null;
    }
}
