package service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Movie;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.*;

public class MovieService {

    public ArrayList<Movie> getAllMovie(){
        ArrayList<Movie> list = new ArrayList<>();
        Gson gson = new Gson();

        try {
            FileReader reader = new FileReader("movie.json");
            Type type = new TypeToken<ArrayList<Movie>>(){}.getType();

            list = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void sortMovieByName(ArrayList<Movie> list){
        Collections.sort(list, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
    }

    public void sortMovieByLength(ArrayList<Movie> list){
        //Code sap xep
    }

    public void sortMovieByView(ArrayList<Movie> list){
        //Code xu ly
    }

    public Map<String, Integer> countCategory(ArrayList<Movie> list){
        Map<String, Integer> map = new HashMap<>();
        for(Movie m : list){
            for (String category : m.getCategory()){
                if(map.containsKey(category)){
                    map.put(category, map.get(category) + 1);
                }else{
                    map.put(category, 1);
                }
            }
        }

        return map;
    }
}
