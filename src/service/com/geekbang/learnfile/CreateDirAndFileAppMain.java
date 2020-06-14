package service.com.geekbang.learnfile;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class CreateDirAndFileAppMain {
        private static final String ROOT="."+ File.separator;//
        private static Scanner scanner=new Scanner(System.in);

        public static void main(String[] args) throws IOException {
                //使用file类，依次创建文件夹，修改文件名字，在指定文件夹创建文件，删除文件，删除文件夹
                File dir=createDir();

                File newDir=renameDir(dir);
                if(newDir==null) return;//

                String fileName=creatFiles(newDir);
                String fileNameNew=renameFiles(newDir,fileName);

                deletFiles(newDir,fileName);

                deletDir(newDir);

        }



        private static void deletDir(File newDir){

                System.out.println("删除文件夹？");

                boolean deleDir=scanner.nextBoolean();
                //删除文件夹的前提是文件夹是空的，否则两删除失败
                if(deleDir){
                        System.out.println("删除文件jia："+newDir.delete());
                }
        }

        private static void deletFiles(File newDir,String fileNameNew){
                System.out.println("删除文件？");

                boolean deletFiles=scanner.nextBoolean();//

                if(deletFiles){
                        for(int i=0;i<20;i++){
                                File fn=new File(newDir,fileNameNew+i+".txt");
                                System.out.println("删除文件"+fn.delete());
                        }
                }
        }

        private static String renameFiles(File newDir,String fileName) throws IOException {
                System.out.println("请输出新的文件名的前缀：");
                String fileNameNew=scanner.next().trim();

                for(int i=0;i<20;i++){
                        File f=new File(newDir,fileName+i+".txt");
                        System.out.println("创建文件："+f.getName()+":"+f.createNewFile());
                }
                return fileName;
        }

        private static File renameDir(File dir){
                System.out.println("请输入新的文件夹的名字：");
                String newDirName=scanner.nextLine().trim();

                File newDir=new File(dir.getParent(),newDirName);
                boolean renameSuccess=dir.renameTo(newDir);

                if(renameSuccess){
                        System.out.println("改名为："+newDirName+"成功");
                }else{
                        System.out.println("改名为："+newDirName+"失败");
                }
                return newDir;
        }

        private static String creatFiles(File newDir) throws IOException {
                System.out.println("请输入文件名的前缀：");
                String fileName=scanner.next().trim();
                for(int i=0;i<20;i++){
                        File f=new File(newDir,fileName+i+".txt");
                        System.out.println("创建文件"+f.getName()+":"+f.createNewFile());
                }
                return fileName;
        }

        private static File createDirs(){
                List<String> pathList=new ArrayList<>();
                while(true){
                        System.out.println("请输入文件路径，如果为空则结束");
                        String path=scanner.nextLine();
                        if(path.isEmpty()){
                                break;
                        }
                        pathList.add(path);
                }
                return createDir(pathList.toArray(new String[0]));
        }

        private static File createDir(String...restPaths){
                String rest=joinRestDir(restPaths);
                System.out.println("将在"+ROOT+"下创建"+rest);
                File dir=new File(ROOT,rest);
                if(dir.exists()&&dir.isDirectory()){
                        System.out.println("文件已经存在"+dir.toString());
                        return dir;
                }else{
                        boolean createSuccess=dir.mkdir();
                        if(createSuccess){
                                return dir;
                        }else{
                                throw new IllegalArgumentException("无法在"+ROOT+"创建"+rest);
                        }
                }
        }

        private static String joinRestDir(String...restPaths){
                return Arrays.stream(restPaths).map(String::trim).collect(Collectors.joining(File.separator));
        }




















}