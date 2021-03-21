import java.io.File;

import service.VideoConversionService;

public class Demo {
    public static void main(String[] args) {
        VideoConversionService converter = new VideoConversionService();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}