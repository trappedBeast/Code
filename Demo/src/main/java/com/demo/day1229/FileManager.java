package com.demo.day1229;

import java.io.*;
import java.util.logging.Logger;

/**
 * @ClassName FileManager
 * @Auther trappedBeast
 * @Date 2018/12/29 11:56
 * @Version 1.0
 * @Description 对Java文件IO等功能进行封装，实现文件的便捷创建，删除，更名，文件移动，文件复制，文件写入，文件读取
 **/
public class FileManager {
    private static Logger logger = Logger.getLogger("com.FirstDemo.day1229.FileManager");//日志
    /**
     * @Author trappedBeast
     * @Date 2018/12/29 16:47
     * @Description 创建文件夹准许标记，
     * 默认为true,遇到文件操作中文件目录不存在时会报错，程序停止运行。
     * 修改为false，遇到文件操作中目录不存在时会自动创建该目录，继续下面的操作
     */
    private static boolean newDirFlag = true;


    /**
     * @return void
     * @Author trappedBeast
     * @Description 修改创建文件夹准许标记的状态
     * @Date 2018/12/29 17:51
     * @Param [flag]
     */
    public static void setAccessNewDir(boolean flag) {
        FileManager.newDirFlag = flag;
    }


    /**
     * @return boolean
     * @Author trappedBeast
     * @Description //通过【完整路径】创建文件
     * @Date 2018/12/29 17:52
     * @Param [pathname]
     */
    public static boolean newFile(String pathname) throws IOException {
        File file = new File(pathname);
        if (file.exists()) {
            logger.info(file.getName() + "The file already exists");//文件已经存在
            return false;
        }
        if (file.createNewFile()) {
            return true;
        }
        throw new IOException("An exception occurred in file creation");//文件创建时发生异常
    }

    /**
     * @return boolean
     * @Author trappedBeast
     * @Description //通过【目录+文件名】创建文件
     * @Date 2018/12/29 17:53
     * @Param [dirname, filename]
     */
    public static boolean newFile(String dirname,String filename) throws IOException {
        File dir = new File(dirname);
        File file = new File(dirname + File.separator + filename);
        if (!dir.exists() && !newDirFlag) {
            if (dir.mkdirs()) {
                logger.info(dirname + "The file directory does not exist and has been created automatically");//文件目录不存在，已经自动创建
            } else {
                logger.info(dirname + "Directory creation failed");//目录创建失败
                return false;
            }
        }
        if (newDirFlag) {
            logger.info(dirname + "The file directory does not exist");//文件目录不存在
            return false;
        }
        if (file.exists()) {
            logger.info(file.getName() + "The file already exist");//文件已经存在
            return false;
        }
        if (file.createNewFile())
            return true;
        throw new IOException("An exception occurred in file creation");//文件创建时出现异常
    }


    /**
     * @return int
     * @Author trappedBeast
     * @Description //通过【目录+文件名】批量创建文件
     * @Date 2018/12/29 17:54
     * @Param [dirname, filename]
     */
    public static int newFile(String dirname,String[] filename) throws IOException {
        int num = 0;
        File file = null;
        File dir = new File(dirname);
        if (!dir.exists() && !newDirFlag) {
            if (dir.mkdirs()) {
                logger.info(dirname + "The file directory does not exist and has been created automatically");
            } else {
                logger.info(dirname + "Directory creation filed");
                return num;
            }
        }
        if (newDirFlag) {
            logger.info(dirname + "The file directory does not exist");
            return num;
        }
        for (int i = 0; i < filename.length; i++) {
            file = new File(dirname + File.separator + filename[i]);
            if (file.exists()) {
                logger.info("The file already exist");
                continue;
            }
            if (file.createNewFile())
                num++;
        }
        return num;
    }

    /**
     * @return boolean
     * @Author trappedBeast
     * @Description 通过【完整路径】删除文件
     * @Date 2019/1/2 11:50
     * @Param [pathname]
     */
    public static boolean delete(String pathname) {
        File file = new File(pathname);
        if (!file.exists()) {
            logger.info("The file does not exists");
            return false;
        }
        if (!file.delete()) {
            logger.info("File delete filed");
            return false;
        }
        return true;
    }


    /**
     * @return int
     * @Author trappedBeast
     * @Description 通过【目录+文件名】批量删除文件
     * @Date 2019/1/2 11:55
     * @Param [dirname, filename]
     */
    public static int delete(String dirname,String [] filename) {
        int num = 0;
        File file = null;
        File dir = new File(dirname);
        if (!dir.exists()) {
            logger.info(dirname + "The directory does not exist");
            return num;
        }
        for (int i = 0; i < filename.length; i++) {
            file =new File(dirname+File.separator+filename[i]);
            if(!file.exists()){
                logger.info(dirname+filename+"The file does not exist");
                continue;
            }
            if(file.delete()){
                num++;
            }
            logger.info("File delete filed");
        }

        return num;
    }

    /**
     * @Author trappedBeast
     * @Description 文件复制
     * @Date 2019/1/3 10:18
     * @Param [src, des]
     * @return boolean
     */
    public static boolean copy(String src,String des) throws IOException {
        boolean flag = false;
        File srcFile = new File(src);
        File desFile = new File(des);
        if (!srcFile.exists()) {
            logger.info(srcFile.getName() + "文件不存在");
            return flag;
        }
        if (!srcFile.isFile()) {
            logger.info(srcFile.getName() + "该抽象路径下不是一个文件类型");
            return flag;
        }
        if (!desFile.exists()) {
            boolean newFile = desFile.createNewFile();
            System.out.println(newFile);
        }
        try {
            InputStream input = new FileInputStream(src);
            OutputStream output = new FileOutputStream(des);
            int temp = 0;
            while ((temp = input.read()) != -1) {
                output.write(temp);
            }
            logger.info("文件复制成功");
            input.close();
            output.close();
            return flag = true;
        } catch (FileNotFoundException e) {
            logger.info(e + "文件路径异常");
            return flag;

        } catch (IOException e) {
            logger.info(e + "文件字字节流异常");
            return flag;

        }

    }


    public static boolean fileWriting(String str,String filePath) {
        boolean flag = false;
        if (null == str) {
            logger.info("写文数据为空");
            return flag;
        }
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                logger.info("文件创建出现异常");
                return flag;
            }
        }
        try {
            OutputStream output = new FileOutputStream(filePath);
            byte[] bytes = str.getBytes();
            output.write(bytes);
            return flag;
        } catch (FileNotFoundException e) {
            logger.info(e + "文件路径异常");
            return flag;
        } catch (IOException e) {
            logger.info(e + "文件写入异常");
            return flag;
        }
    }
}
    