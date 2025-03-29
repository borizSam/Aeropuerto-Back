package com.example.aeropuerto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/health")
    public Map<String, Object> healthCheck() {
        Map<String, Object> health = new HashMap<>();

        // Estado general
        health.put("status", "UP");

        // Timestamp
        health.put("timestamp", System.currentTimeMillis());

        // Uso de memoria
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;
        long maxMemory = runtime.maxMemory();

        Map<String, Object> memory = new HashMap<>();
        memory.put("usedMemoryMB", usedMemory / (1024 * 1024));
        memory.put("freeMemoryMB", freeMemory / (1024 * 1024));
        memory.put("totalMemoryMB", totalMemory / (1024 * 1024));
        memory.put("maxMemoryMB", maxMemory / (1024 * 1024));

        // Agregar info de memoria al health
        health.put("memory", memory);

        return health;
    }
}
