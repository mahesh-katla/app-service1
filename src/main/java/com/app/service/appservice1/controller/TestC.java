package com.app.service.appservice1.controller;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TestC {

   public static InputStream appendCRLFToSupportJava11AndAbove(InputStream stream) throws IOException {
        byte[] bytes = IOUtils.toByteArray(stream);
        StringBuilder inputMessage = new StringBuilder();
        try (Reader reader = new InputStreamReader(new ByteArrayInputStream(bytes), StandardCharsets.UTF_8)) {
            char[] buffer = new char[1024];
            char previousChar = 0;
            for (int numBytesRead = reader.read(buffer); numBytesRead != -1; numBytesRead = reader.read(buffer)) {
                for (int i = 0; i < numBytesRead; i++) {
                    appendCRLF(buffer[i], previousChar, inputMessage);
                    previousChar = buffer[i];
                }
            }
        }
        return new ByteArrayInputStream(inputMessage.toString().getBytes());
    }

    private static void appendCRLF(char c, char previousChar, StringBuilder inputMessage) {
        if (c == '\n' && previousChar != '\r') {
            inputMessage.append("\r\n");
        } else {
            inputMessage.append(c);
        }
    }
}
