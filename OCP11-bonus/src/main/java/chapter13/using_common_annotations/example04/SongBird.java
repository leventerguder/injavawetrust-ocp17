package chapter13.using_common_annotations.example04;

import java.util.List;

public class SongBird {

    @Deprecated
    static void sing(int volume) {
    }

    static Object chirp(List<String> data) {
        return data.size();
    }
}
