package baitap_copyfile;

import java.io.*;
import java.util.Scanner;

public class WritterReaderFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao duong dan cua file nguon: ");
        String filePathSource = scanner.nextLine();
        System.out.println("Nhap vao duong dan cua file dich ma ban muon copy : ");
        String filePathTarget = scanner.nextLine();
        writterReadeFile(filePathSource,filePathTarget);

    }
    private static void writterReadeFile (String filePathSource, String filePathTarget) {
        try {
            File fileSource= new File(filePathSource);
            File fileTarget= new File(filePathTarget);
            BufferedReader br1 = new BufferedReader(new FileReader(fileSource));
            FileOutputStream fs = new FileOutputStream(fileTarget);
            DataOutputStream dos = new DataOutputStream(fs);
            String line="";
            int sumSource=0;
            int sumTarget=0;
            if (!fileSource.exists()||!fileTarget.exists()){
                throw new FileNotFoundException();
            }

            while ((line=br1.readLine())!=null){
                sumSource+=line.length();
                dos.writeChars(line);
            }
            System.out.println("So luong phan tu co trong file nguon la "+ sumSource );

            BufferedReader br2 = new BufferedReader(new FileReader(fileSource));
            while ((line=br2.readLine())!=null){
                System.out.println(line);
                sumTarget+=line.length();
            }
            System.out.println("So luong phan tu co trong file dich la "+ sumTarget );



        } catch (FileNotFoundException e) {
            System.err.println("File k ton tai");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
