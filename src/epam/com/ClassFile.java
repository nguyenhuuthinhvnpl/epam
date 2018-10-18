package epam.com;

import java.io.*;

public class ClassFile {

    public ClassFile(){ }
    public boolean isFileValid(File file) throws IOException {
        DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
        int fileSignature = input.readInt();
        input.close();
        System.out.println("Magic number of jpg is " + fileSignature);
        if (fileSignature == 0xffd8ffe0) {
            System.out.println("File is a *jpg extension.");
            return true;
        } else if(fileSignature == 0x89504E47){
            System.out.println("File is a  *png extension.");
            return true;
        } else {return false;}
    }
}
