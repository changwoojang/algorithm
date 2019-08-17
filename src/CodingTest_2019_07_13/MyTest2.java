package CodingTest_2019_07_13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyTest2 {
    public enum File{

        MUSIC("music",Arrays.asList("mp3","aac","flac"), 0),
        IMAGE("images", Arrays.asList("jpg","bmp","gif"), 0),
        MOVIE("movies", Arrays.asList("mp4","avi","mkv"), 0),
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
            this.boardSize = this.boardSize + boardSize;
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

    private String resultOfBoardTypeAndTotalBoardSize(List<File> boardList){
        StringBuilder result = new StringBuilder();
        for(File each : boardList){
            result.append(each.getBoardType() + " " + each.getBoardSize() + "b" +"\n");
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

        return resultOfBoardTypeAndTotalBoardSize(Arrays.asList(File.MUSIC, File.IMAGE,File.MOVIE, File.OTHER));
    }
}
