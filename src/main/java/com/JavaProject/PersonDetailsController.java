package com.JavaProject;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
public class PersonDetailsController {
    @GetMapping("/details")
    public List<DemoData> details() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        List<DemoData> data = mapper.readValue(new File("src/main/resources/posts.json"), List.class);

        return data;
    }
}








