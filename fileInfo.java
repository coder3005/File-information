/* File Information */
import java.io.File;
class fileInfo
{
    public static void main(String[] args) {
        
        File f=new File("C:\\Users\\Abhi Gupta\\downloads\\LC.txt");

        if(f.exists())
        {
            System.out.println("File Name: "+f.getName());
            System.out.println("File Location: "+f.getAbsolutePath());
            System.out.println("File Writable: "+f.canWrite());
            System.out.println("File Readable: "+f.canRead());
            System.out.println("File Size: "+f.length());
            System.out.println("File Removed: "+f.delete());
        }
        else
        {
            System.out.println("File doesn't Exists");
        }
    }
}
