import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AlbumUtil {

    public Stream<Album> retrieveAlbumsByArtist(Stream<Album> albumStream, String artist) {
       return albumStream.filter(Album -> Album.getArtist().equals(artist));
        
       
    }

    
    public List<String> getAlbumTitlesByRating(Stream<Album> albumStream, double rating) {
        
        
        return albumStream.filter(Album -> Album.getRating() >= rating).map(Album::getTitle).toList();
    }
    
    
    public int getTotalLikesByArtist(Stream<Album> albumStream, String artist) {
         
       return albumStream.filter(e -> e.getArtist().equalsIgnoreCase(artist)).collect(Collectors.summingInt(e->e.getNoOfLikes()));
         
        
    }
}