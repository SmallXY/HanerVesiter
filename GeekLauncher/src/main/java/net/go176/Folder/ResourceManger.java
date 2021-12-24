package net.go176.Folder;

import net.go176.工具包.DownloadImage;

import java.io.File;

public class ResourceManger {
    public static void 检查文件夹是否存在() {
        File 文件夹 = new File("C:\\Windows\\YuanMeng");
        if (!文件夹.exists() && !文件夹.isDirectory())
            文件夹.mkdirs();
        File 资源文件夹 = new File("C:\\Windows\\YuanMeng\\Resource");
        if (!资源文件夹.exists() && !资源文件夹.isDirectory())
            资源文件夹.mkdirs();
    }

    public static void 检查该资源是否存在(String 文件名,String 原链接) {
        File 资源 = new File("C:\\Windows\\YuanMeng\\Resource\\" + 文件名);
        if (!资源.exists())
            DownloadImage.内容(原链接, "Resource\\" + 文件名);
    }
}
