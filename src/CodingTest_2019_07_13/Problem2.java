package CodingTest_2019_07_13;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Problem2 {

    public enum FileType {
        MUSIC("music", new HashSet<>(Arrays.asList("mp3", "aac", "flac"))),
        IMAGE("images", new HashSet<>(Arrays.asList("jpg", "bmp", "gif"))),
        MOVIE("movies", new HashSet<>(Arrays.asList("mp4", "avi", "mkv"))),
        OTHER("other");

        private String name;
        private Set<String> members;

        FileType(String name) {
            this.name = name;
            this.members = null;
        }

        FileType(String name, Set<String> members) {
            this.name = name;
            this.members = members;
        }

        public String getName() {
            return name;
        }

        public boolean isMember(String extension) {
            if (members == null) {
                return true;
            }
            return members.contains(extension.toLowerCase());
        }


        public static FileType identifyFileType(String extension) {
            for (FileType fileType : FileType.values()) {
                if (fileType.isMember(extension)) {
                    return fileType;
                }
            }
            return FileType.OTHER;
        }
    }

    public class File {

        private FileType type;
        private String fileName;
        private String extension;
        private int size;

        File(FileType type, String fileName, String extension, int size) {
            this.type = type;
            this.fileName = fileName;
            this.extension = extension;
            this.size = size;
        }

        public FileType getType() {
            return type;
        }

        public String getFileName() {
            return fileName;
        }

        public String getExtension() {
            return extension;
        }

        public int getSize() {
            return size;
        }
    }

    private File parse(String line) {
        String[] splitWithSpace = line.split(" ");
        String fileNamePart = splitWithSpace[0];
        String fileSizePart = splitWithSpace[1];

        //file name parsing
        String[] splitWithDot = fileNamePart.split("\\.");
        String extension = splitWithDot[splitWithDot.length - 1];
        String fileName = line.substring(0, line.length() - extension.length());
        FileType fileType = FileType.identifyFileType(extension);

        //size parsing
        int size = Integer.parseInt(fileSizePart.substring(0, fileSizePart.length() - 1));
        return new File(fileType, fileName, extension, size);
    }

    private int getTotalSizeOfFileType(List<File> files, Predicate<FileType> filter) {
        return files.stream().filter(file -> filter.test(file.getType())).mapToInt(File::getSize)
            .sum();
    }


    public String solution(String S) {
        List<File> files = Arrays.stream(S.split("\n")).map(this::parse)
            .collect(Collectors.toList());

        StringBuilder builder = new StringBuilder();
        for (FileType fileType : FileType.values()) {
            int totalSize = getTotalSizeOfFileType(files, Predicate.isEqual(fileType));
            builder.append(String.format("%s %db\n", fileType.getName(), totalSize));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Problem2 problem2 = new Problem2();
        String input = "my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b";
        System.out.println(problem2.solution(input));
    }
}
