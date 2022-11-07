package ru.milovtim.springsample;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
public class ResourceLoader {

    private final ObjectMapper objectMapper;
    private Resource graphInJson;

    public ResourceLoader(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Value("${app.resource.graph}")
    public void setGraphInJson(Resource graphInJson) {
        this.graphInJson = graphInJson;
    }

    public Graph getGraph() {
        if (graphInJson != null && graphInJson.exists()) {
            try {
                return objectMapper
                    .readerFor(Graph.class)
                    .readValue(graphInJson.getInputStream());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }
}
