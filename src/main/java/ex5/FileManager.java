package ex5;
import java.io.*;
import java.nio.channels.FileChannel;

public class FileManager {

    public void CopyFile(File src, File dest) throws FileOperationsException {
        try (
            FileChannel sourceChannel = new FileInputStream(src).getChannel();
            FileChannel destChannel = new FileOutputStream(dest).getChannel()
        ) {

            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        }catch(IOException e){
            throw  new FileOperationsException("Copy file failed", e);

        }
    }

    public void SaveFile(String filePath) throws FileOperationsException {
        try(FileWriter nFile = new FileWriter(filePath)){
            nFile.write("test");
        }catch (IOException e){

            throw new FileOperationsException("Saving file failed.", e);
        }
    }

    public void Read(String filePath) throws FileOperationsException {
        try(FileReader reader = new FileReader(filePath)){
            while (reader.ready()) {
                String c = String.valueOf(reader.read());
                System.out.println(c);
            }
        }catch (IOException e){
            throw new FileOperationsException("Reading file failed.", e);
        }
    }
}
