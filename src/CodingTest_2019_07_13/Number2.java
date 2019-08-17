package CodingTest_2019_07_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by changwooj111@gmail.com on 11/07/2019
 * Blog : http://woo-repository.tistory.com/
 * Github : https://github.com/changwoojang
 */
public class Number2 {
//    private class FileInfo{
//
//        String fileExtension;
//        int fileSize;
//
//        public String getFileExtension() {
//            return fileExtension;
//        }
//
//        public int getFileSize() {
//            return fileSize;
//        }
//
//        public void setFileExtension(String fileExtension) {
//            this.fileExtension = fileExtension;
//        }
//
//        public void setFileSize(int fileSize) {
//            this.fileSize = fileSize;
//        }
//    }
//    public enum File2{
//
//        MUSIC("music",Arrays.asList("mp3","aac","flac"), 0),
//        IMAGE("images", Arrays.asList("jpg","bmp","gif"), 0),
//        MOVIES("movies", Arrays.asList("mp4","avi","mkv"), 0),
//        OTHER("other", Arrays.asList("7z","txt","zip"), 0);
//
//        private String boardType;
//        private List<String> boardTypefileExtensions;
//        private int boardSize;
//
//        File2(String boardType, List<String> boardTypefileExtensions, int boardSize) {
//            this.boardType = boardType;
//            this.boardTypefileExtensions = boardTypefileExtensions;
//            this.boardSize = boardSize;
//        }
//
//        public String getBoardType() {
//            return boardType;
//        }
//
//        public void setBoardType(String boardType) {
//            this.boardType = boardType;
//        }
//
//        public int getBoardSize() {
//            return boardSize;
//        }
//
//        public void setBoardSize(int boardSize) {
//            this.boardSize = boardSize;
//        }
//
//        public List<String> getBoardTypefileExtensions() {
//            return boardTypefileExtensions;
//        }
//
//        public void setBoardTypefileExtensions(List<String> boardTypefileExtensions) {
//            this.boardTypefileExtensions = boardTypefileExtensions;
//        }
//    }
//
//
//    public enum File{
//
//        MUSIC("music",Arrays.asList("mp3","aac","flac"),0),
//        IMAGE("images",Arrays.asList("jpg","bmp","gif"),0),
//        MOVIES("movies",Arrays.asList("mp4","avi","mkv"),0),
//        OTHER("other",Arrays.asList("other"),0);
//
//        private String title;
//        private List<String> contentTypeList;
//        private int size;
//
//        File(String title, List<String> contentTypeList, int size){
//            this.title = title;
//            this.contentTypeList = contentTypeList;
//            this.size = size;
//        }
//
//        public boolean hasContent(String contentType){
//            return contentTypeList.stream().anyMatch(content->content.equals(contentType));
//        }
//
//        public void setSize(int size) {
//            this.size = this.size + size;
//        }
//        public int getSize(){
//            return size;
//        }
//
//        public String getTitle() {
//            return title;
//        }
//
//        public void setTitle(String title) {
//            this.title = title;
//        }
//
//    }
//
//    private FileInfo parsingFromRawData(String eachFiles){
//
//        String[] delimiteFileNameAndFileSize = eachFiles.split(" ");
//        String fileName = delimiteFileNameAndFileSize[0];
//
//        FileInfo fileInfo = new FileInfo();
//        fileInfo.setFileSize(getDiskSize(delimiteFileNameAndFileSize[1]));
//        fileInfo.setFileExtension(getFileExtension(fileName.split("\\.")));
//
//        return fileInfo;
//    }
//
//    public static String[] splitText(String text, String delimeter){
//        return text.split(delimeter);
//    }
//
//    public int getDiskSize(String fileSize){
//        return Integer.parseInt(splitText(fileSize,"b")[0]);
//    }
//
//    public String getFileExtension(String[] contentType){
//        return contentType[contentType.length-1];
//    }
//
//    public String printResultList(List<File> fileList){
//        for(File each : fileList){
//            System.out.println(each.getTitle()+" "+each.getSize()+"b");
//        }
//        return "AA";
//    }
//
//    public String solution(String S){
//
//        List<FileInfo> files = Arrays.stream(S.split("\n")).map(this::parsingFromRawData)
//                .collect(Collectors.toList());
//
//        for(FileInfo each : files){
//            if(File.MUSIC.hasContent(each.fileExtension)){
//                File.MUSIC.setSize(each.fileSize);
//            }
//            else if(File.IMAGE.hasContent(each.fileExtension)){
//                File.IMAGE.setSize(each.fileSize);
//            }
//            else if(File.MOVIES.hasContent(each.fileExtension)){
//                File.MOVIES.setSize(each.fileSize);
//            }
//            else {
//                File.OTHER.setSize(each.fileSize);
//            }
//        }
//
//        return printResultList(Arrays.asList(File.MUSIC,File.IMAGE,File.MOVIES,File.OTHER));
//
//    }
public enum File{

    MUSIC("music",Arrays.asList("mp3","aac","flac"), 0),
    IMAGE("image", Arrays.asList("jpg","bmp","gif"), 0),
    MOVIE("movie", Arrays.asList("mp4","avi","mkv"), 0),
    OTHER("other", Arrays.asList("7z","txt","zip"), 0);

    private String boardType;
    private List<String> boardTypefileExtensions;
    private int boardSize;

    File(String boardType, List<String> boardTypefileExtensions, int boardSize) {
        this.boardType = boardType;
        this.boardTypefileExtensions = boardTypefileExtensions;
        this.boardSize = boardSize;
    }

    public String getBoardType() {
        return boardType;
    }

    public void setBoardType(String boardType) {
        this.boardType = boardType;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }

    public List<String> getBoardTypefileExtensions() {
        return boardTypefileExtensions;
    }

    public void setBoardTypefileExtensions(List<String> boardTypefileExtensions) {
        this.boardTypefileExtensions = boardTypefileExtensions;
    }
    public boolean hasBoardTypeFileExtensions(String fileExtention){
        return boardTypefileExtensions.stream().anyMatch(content->content.equals(fileExtention));
    }
}

    private class FileInfo{

        String fileExtension;
        int fileSize;

        public String getFileExtension() {
            return fileExtension;
        }

        public int getFileSize() {
            return fileSize;
        }

        public void setFileExtension(String fileExtension) {
            this.fileExtension = fileExtension;
        }

        public void setFileSize(int fileSize) {
            this.fileSize = fileSize;
        }
    }

    private String[] splitText(String fileNameOrSize, String delimeter){
        return fileNameOrSize.split(delimeter);
    }

    private int getFileSize(String fileSize){
        return Integer.parseInt(splitText(fileSize,"b")[0]);
    }

    private String getFileExtention(String fullNameOfFileName){
        String[] fileExtention = fullNameOfFileName.split("\\.");
        return fileExtention[ fileExtention.length - 1 ];
    }

    private FileInfo parsingFromRawData(String eachFiles){
        String[] delimiteFileNameAndFileSize = eachFiles.split(" ");
        String fullNameOfFileName = delimiteFileNameAndFileSize[0];
        String fullNameofFileSize = delimiteFileNameAndFileSize[1];

        FileInfo fileInfo = new FileInfo();
        fileInfo.setFileExtension(getFileExtention(fullNameOfFileName));
        fileInfo.setFileSize(getFileSize(fullNameofFileSize));
        return fileInfo;
    }

    private String getBoardTypeAndTotalBoardSize(List<File> boardList){
        StringBuilder result = new StringBuilder();
        for(File each : boardList){
            result.append(each.getBoardType() + " " + each.getBoardSize() + "b" +"\n");
//            System.out.print("result: "+result);
        }

        return result.toString();
    }

    public String solution(String S) {
        // write your code in Java SE 8
        List<FileInfo> fileList = Arrays.stream(S.split("\n")).map(this::parsingFromRawData).collect(Collectors.toList());

        for(FileInfo eachFileInfo : fileList){

            if(File.MUSIC.hasBoardTypeFileExtensions(eachFileInfo.getFileExtension())){
                File.MUSIC.setBoardSize(eachFileInfo.getFileSize());
            }
            else if(File.IMAGE.hasBoardTypeFileExtensions(eachFileInfo.getFileExtension())){
                File.IMAGE.setBoardSize(eachFileInfo.getFileSize());
            }
            else if(File.MOVIE.hasBoardTypeFileExtensions(eachFileInfo.getFileExtension())){
                File.MOVIE.setBoardSize(eachFileInfo.getFileSize());
            }
            else {
                File.OTHER.setBoardSize(eachFileInfo.getFileSize());
            }
        }

        return getBoardTypeAndTotalBoardSize(Arrays.asList(File.MUSIC, File.IMAGE,File.MOVIE, File.OTHER));
    }
    public static void main(String[] args){

        String T = "my.song.mp3 11b \n" +
                "greateSong.flac 1000b \n" +
                "not3.txt 5b\n" +
                "video.mp4 200b\n" +
                "game.exe 100b \n" +
                "mov!e.mkv 10000b\n";

        Number2 num = new Number2();
        System.out.println(num.solution(T));
    }
}
