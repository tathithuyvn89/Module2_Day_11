package thuchanh_tinhtongsofiletext;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadExample  {
    public static void main(String[] args) {
        System.out.println("Nhap duong dan file : ");
        Scanner scanner= new Scanner(System.in);
        String path=scanner.nextLine();
        ReadExample readExample= new ReadExample();
        readExample.readFileText(path);

    }
    public void readFileText(String filePath){
        try{
            //Doc file theo duong dan
            File file = new File(filePath);
            //Kiem tra neu file khong ton tai thi nem ra ngoai ke
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            //Doc tung dong cua file va tien hanh cong tong lai
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line ="";
            int sum=0;
            while ((line=br.readLine())!=null){
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }
            br.close();
            //Hien thi ra man hinh tong cac so nguyen trong file
            System.out.println("Tong: "+sum);

        } catch (Exception e){
            System.err.println("File khong tin tai or noi dung bi loi ");
        }
    }
}
