package com.github.sieunkr.springstatic.commons;

import java.io.File;

public interface StaticRepository extends Repository {

    void save(File file);
    File findOne(String bucket, String name);

}
