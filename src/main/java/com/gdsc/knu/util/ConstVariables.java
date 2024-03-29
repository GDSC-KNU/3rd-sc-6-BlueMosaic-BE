package com.gdsc.knu.util;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class ConstVariables {
    @Value("${production.frontend.url}")
    private String FRONTEND_URL;
    @Value("${production.backend.url}")
    private String BACKEND_URL;
    @Value("${media.file.directory}")
    private String fileDirectory;
    @Value("${google.ai.studio.api.key}")
    private String API_KEY;
    @Value("${google.ai.studio.api.url}")
    private String API_URL;
}
