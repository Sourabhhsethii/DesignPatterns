package learning.patterns.basics.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("b", 10, Genre.ACTION),
                new Movie("a", 15,Genre.THRILLER),
                new Movie("c", 20,Genre.ACTION)
        );

        // Imperative Programming -> How
        int count = 0;
        for (var movie : movies){
            if(movie.getLikes() >  10)
                count++;
        }
        System.out.println(count);
        // Declarative programming -> What need to be done?

        // Steams doesnot store data, its only the way to get the data.
        // Water Tank is the Collection but streams is like pipe -> A way of getting the data.
        movies.forEach(movie -> System.out.println(movie.getLikes()));
        var count2 = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .count();
        System.out.println(count2);

        /**
         * Streams Maps Operations
         */
        movies.stream()
                .map(movie -> movie.getTile())
                .forEach(name-> System.out.println(name));

        movies.stream().mapToInt(movie-> movie.getLikes())
                .forEach(System.out::println);

        /**
         * Flaten the list of the object Steams of Object.
         *  Stream<List<x>> -> Stream<x>
         */
        var str1 = Stream.of(List.of(1,2,3), List.of(4,5,6));
        str1.
                flatMap(list -> list.stream())
                .forEach(System.out::println);

        movies.stream().filter(m -> m.getLikes() > 10).forEach(System.out::println);


        /**
         * Slicing the stream
         * limit
         * skip
         * takewhile
         * dropwhile
         */

        // 1000 Movies
        // 10 Movies Per page
        // skip(20) = skip (page -1) x pageSize)
        // limit(10) = limit(pageSize)

        movies.stream().skip(2).limit(2).forEach(movie -> System.out.println(movie.getTile()));
        movies.stream().takeWhile(movie -> movie.getLikes()<30).forEach(m-> System.out.println("Test Take While-> "+m.getTile()));

        movies.stream()
                .sorted(Comparator.comparing(Movie::getTile).reversed())
                .forEach(a-> System.out.println(a.getTile()));

        System.out.println("---");
        movies.stream().filter(m->m.getLikes()>2)
                .peek(m -> System.out.println("filter: + " + m.getTile()))
                .map(Movie::getTile)
                .peek(m -> System.out.println("Map: + " + m))
                .forEach(System.out::println);

        // Reducers
        boolean result  = movies.stream().anyMatch(movie -> movie.getLikes()>15);
        System.out.println(result);

        var findFirst = movies.stream().findFirst().get();
        System.out.println(findFirst);

        var comparing = movies.stream().max(Comparator.comparing(Movie::getLikes)).get();
        System.out.println(comparing);

        //
        System.out.println( "Return SUM ->" +movies.stream().map(m-> m.getLikes()).reduce(Integer::sum).get());

        var resultMovies = movies.stream().filter(movie -> movie.getLikes()>15).collect(Collectors.toMap(movie -> movie.getTile(), movie -> movie.getLikes()));
        System.out.println(resultMovies);

        var resultGruop = movies.stream().collect(Collectors.groupingBy(Movie::getGenre,Collectors.toSet()));
        System.out.println(resultGruop);

        IntStream.range(1,5).forEach(System.out::println);
    }
}
