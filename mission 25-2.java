package Job;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class File {

	public static void main(String[] args) throws Exception {
        
        // определяем объект для каталога
        File dir = new File("C://");
        FileWriter nFile = new FileWriter("file1.txt");
        // если объект представляет каталог
        if(dir.isDirectory())
        {
            // получаем все вложенные объекты в каталоге
            for(File item : dir.listFiles()){
              
                 if(item.isDirectory()){
                      
                     System.out.println(item.getName() + "  \t folder");
                     nFile.write(item.getName());
                 }
                 else{
                      
                     System.out.println(item.getName() + "\t file");
                     nFile.write(item.getName());
                 }
             }
            nFile.close();
        }
    }
	}