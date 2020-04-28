import java.io.File;

public class Demo1 {
    public static void main(String[] args) {
        File file= new File("C:\\Users\\BKComputer\\Desktop\\meo.txt");
        File dir= new File("Books");
        dir.mkdir();
        if (dir.isDirectory()){
            String[] dirContents= dir.list();
            for (int i=0; i<dirContents.length;i++){
                System.out.println(dirContents[i]);
            }
        }
        //Lay duong dan tuyet doi cua file trong thu muc
        System.out.println(dir.getAbsolutePath());
        //Xoa file trong thu muc tra ve true neu xoa thanh cong
        boolean isDeleted = file.delete();
        System.out.println(isDeleted);

    }

}
