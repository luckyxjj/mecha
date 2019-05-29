package com.lucky.mecha.utils;


import com.lucky.mecha.Constant.Constants;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class FileUtil {

    /**
     * 获取文件后缀
     *
     * @param fileName
     * @return
     */
    public static String getSuffix(String fileName) {
        return fileName.substring(fileName.lastIndexOf("."));
    }

    /**
     * 新增文件
     *
     * @param file
     * @param onlyPath
     * @return 返回存储图片路径 filepaths
     * @throws IOException
     */
    public static String addFile(MultipartFile file, String onlyPath) throws IOException {
        String savePath = "upload" + File.separator + System.currentTimeMillis() + RandomUtils.generateString(10) + FileUtil.getSuffix(file.getOriginalFilename());
//        String filePath = Constants.SOURCE_PATH + filepaths;
        File saveDir = new File(onlyPath+savePath);
        if (!saveDir.getParentFile().exists()) {
            saveDir.getParentFile().mkdirs();
        }
        // 转存文件
        file.transferTo(saveDir);
        return savePath;
    }

    /**
     * 修改文件
     * @param file
     * @param imgPath
     * @throws IOException
     */
    public static void updateFile(MultipartFile file, String imgPath) throws IOException {
        File saveDir = new File(imgPath);
        if (!saveDir.getParentFile().exists()) {
            saveDir.getParentFile().mkdirs();
        }
        // 转存文件
        file.transferTo(saveDir);
    }
    /**
     * 多文件上传
     *
     * @param multipartfiles
     * @param onlyPath
     * @return 返回存储图片路径 filepath
     * @throws IOException
     */
    public static String uploadFiles(MultipartFile[] multipartfiles, String onlyPath) throws IOException {

        //遍历并保存文件
        StringBuffer sb = new StringBuffer();
        for (MultipartFile file : multipartfiles) {
            //得到文件的路径
            String savePath = "upload" + File.separator + System.currentTimeMillis() + RandomUtils.generateString(10) + FileUtil.getSuffix(file.getOriginalFilename());

//            String filePath = Constants.SOURCE_PATH + filepath;
            File saveDir = new File(onlyPath+savePath);
            if (!saveDir.getParentFile().exists()) {
                saveDir.getParentFile().mkdirs();
            }
            file.transferTo(saveDir);
            sb.append(savePath).append(",");
        }
        String path = sb.substring(0, sb.length() - 1);
        return path;

    }

    /**
     * 删除文件
     *
     * @param fileName
     */
    public static void deleteFile(String fileName) {
//        String path = "/usr/local/workspace";
        File file = new File(fileName);
        System.out.println(file);
        if (file.exists()) {
            file.delete();
            System.out.println("删除完毕");
        } else {
            System.out.println("该文件不存在!");
        }
    }
}
