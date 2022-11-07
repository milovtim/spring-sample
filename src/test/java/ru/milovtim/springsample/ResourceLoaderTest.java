package ru.milovtim.springsample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ResourceLoaderTest {
    @Autowired
    ResourceLoader resourceLoader;

    @Test
    void getGraph() {
        Object graph = resourceLoader.getGraph();
        assertNotNull(graph);
    }
}