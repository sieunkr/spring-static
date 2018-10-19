package com.github.sieunkr.springstatic.minio;

import io.minio.MinioClient;
import io.minio.errors.MinioException;

import java.io.File;

public class SimpleMinioRepository implements MinioRepository {

    @Override
    public void save(File file) {

        //TODO:실제 코드 구현
        try {
            MinioClient minioClient = new MinioClient("http://minio-ip", "accessKey", "secretKey");

            // Check if the bucket already exists.
            boolean isExist = minioClient.bucketExists("new_bucket");
            if(isExist) {
                System.out.println("Bucket already exists.");
            } else {
                // Make a new bucket called asiatrip to hold a zip file of photos.
                minioClient.makeBucket("new_bucket");
            }

            // Upload the zip file to the bucket with putObject
            minioClient.putObject("new_bucket","myimage.png", "D:\\\\Data\\\\myimage.png");
        } catch(MinioException e) {
            System.out.println("Error occurred: " + e);
        } catch(Exception e) {
            System.out.println("Error occurred: " + e);
        }
        //IOException, InvalidKeyException, NoSuchAlgorithmException

    }

    @Override
    public File findOne(String bucket, String name) {
        return null;
    }

    @Override
    public void deleteFile(String bucket, String name) {

    }

    @Override
    public void makeBucket(String bucket) {

    }


}
