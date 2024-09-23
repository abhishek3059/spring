import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of albums");
        int totalAlbums = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the album details");
        ArrayList<Album> albumRecords = new ArrayList<>();
        for (int i = 0; i < totalAlbums; i++) {
            String input = sc.nextLine();
            sc.nextLine();
            String s[] = input.split(":");
            String title = s[0];
            String artist = s[1];
            LocalDate releaseDate = LocalDate.parse(s[2], DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            double rating = Double.parseDouble(s[3]);
            int noOfLikes = Integer.parseInt(s[4]);
            albumRecords.add(new Album(title,artist,releaseDate,rating,noOfLikes));
            
            
        }
        AlbumUtil au = new AlbumUtil();
        System.out.println("Enter the artist name");
        String artistName = sc.next();
        Stream<Album> s = au.retrieveAlbumsByArtist(albumRecords.stream(), artistName);
        for(Album a : s.toList()) {
        	System.out.println(a);
        }
        System.out.println("Enter the rating");
        double rating = sc.nextDouble();
       List<String> s1 = new ArrayList<>();
       s1 = au.getAlbumTitlesByRating(albumRecords.stream(), rating);
       if(s1.isEmpty()) {}
       System.out.println("Albums with the higher than or equal to " + rating+" are");
       for(String string : s1) {
    	   System.out.println(string);
       }
       System.out.println("Enter the artist name");
       String name = sc.next();
       int noOfLikesForArtist = au.getTotalLikesByArtist(albumRecords.stream(), name);
       System.out.println("Total likes for all albums by the artist "+name+ " are "+noOfLikesForArtist);
    }
}
