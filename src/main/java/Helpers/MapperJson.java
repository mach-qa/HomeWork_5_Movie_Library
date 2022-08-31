package Helpers;

import Models.Movie;
import Models.MovieLibrary;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class MapperJson {

    public static List<MovieLibrary> deserializedJsonList () throws IOException {
        File jsonFile = new File("src/main/resources/movies.json");
        return new ObjectMapper().enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
                .readValue(jsonFile, new TypeReference<>() {});
    }

}
