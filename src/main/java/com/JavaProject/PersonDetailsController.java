package com.JavaProject;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


@RestController
public class PersonDetailsController {

    @GetMapping("/details")
    public String getRadarData() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        DemoData user1 = mapper.readValue(new File("src/main/resources/posts.json"), DemoData.class);
        String jsonInString = mapper.writeValueAsString(user1);
        return jsonInString;
    }

    }







