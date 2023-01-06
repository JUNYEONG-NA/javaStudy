package on0107;

import java.io.*;

public class Ch08_ex15_Exception15 {

//    #15
//    public static void main(String[] args) {
//        File f = createFile(args[0]);
//        System.out.println(f.getName()+" is Successfully created");
//
//    }
//    static File createFile(String fileName){
//        try{
//            if(fileName ==null || fileName.equals("")){
//                throw new Exception("file name can't use");
//            }
//        }catch (Exception e){
//            fileName = "None.txt";
//        }finally {
//            File f = new File(fileName);
//            createNewFile(f);
//            return f;
//        }
//    }
//    static void createNewFile(File f){
//        try{
//            f.createNewFile();
//        }catch (Exception e){
//
//        }
//    }

//    #16
    public static void main(String[] args) {
        try {
            File f = createFile(args[0]);
            System.out.println(f.getName() + " is Successfully created");
        }catch (Exception e){
            System.out.println(e.getMessage() + " insert again");
        }
    }
    static File createFile(String fileName) throws Exception{
        if(fileName ==null || fileName.equals("")) {
            throw new Exception("file name can't use");
        }
            File f = new File(fileName);
            f.createNewFile();
            return f;
    }
}
