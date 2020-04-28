package baitap_docfilecsv;


import java.io.*;

public class CSVReader {
    public static void main(String[] args) {
       try {
           File file = new File("tinhthanhpho.csv");
           if (!file.exists()){
               throw new FileNotFoundException();
           }
           BufferedReader bf= new BufferedReader(new FileReader(file));
           String line="";
           while ((line=bf.readLine())!=null){
               String []tinh=line.split(",");
               System.out.println("Code Country [code= " + tinh[4] + " , name=" + tinh[5] + "]");
           }
           bf.close();
       } catch (FileNotFoundException e){
           System.err.println("Not Find this file");
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
