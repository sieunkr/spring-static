package com.github.sieunkr.springstatic.commons;

import org.xmlpull.v1.XmlPullParserException;

import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public interface StaticRepository extends Repository {

    void save(File file) throws XmlPullParserException, NoSuchAlgorithmException, InvalidKeyException, IOException;
    File findOne(String bucket, String name);
    void deleteFile(String bucket, String name);
    void makeBucket(String bucket);

}
