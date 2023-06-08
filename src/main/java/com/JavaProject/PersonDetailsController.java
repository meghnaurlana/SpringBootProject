package com.JavaProject;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


@RestController
public class PersonDetailsController {

    @GetMapping("/details")
    public String getRadarData() throws IOException {

        String jsonData = new String(Files.readAllBytes(Paths.get(new ClassPathResource("posts.json").getURI())));

        // Parse the JSON data
        JSONArray jsonArray = new JSONArray(jsonData);

        // Send the JSON array in the response
        return DemoData.ok(jsonArray.toString());
    }
}








