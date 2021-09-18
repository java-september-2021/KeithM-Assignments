import java.util.Set;
import java.util.HashMap;
public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Original Song", "Our hit song that exists only because we are awesome and everyone loves us." );
        trackList.put("Second Song About Life", "This song is about life. Not just any life. But the life of our band members. Which is the best life.");
        trackList.put("A song that nobody cares about", "This is a bunch of lyrics for this song. Realistically the song is about nothing. This is probably why nobody cares about this song.");
        trackList.put("A one worded song", "Music");

        //Call one specific Song
        System.out.println("Original Song");
        System.out.println(trackList.get("Original Song"));


        // Loop through all of the different songs.
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key + ": " + trackList.get(key));  
        }
    }
}

