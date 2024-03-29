package com.calculator.calculator.calculator;

import com.calculator.calculator.ClientRequestHandler;
import com.calculator.calculator.HttpRequest;
import com.calculator.calculator.HttpResponse;
import com.calculator.calculator.QueryStrings;
import com.calculator.calculator.calculator.domain.Calculator;
import com.calculator.calculator.calculator.domain.PositiveNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CustomWebApplicationServer {
    private final int port;

    private final ExecutorService executorService = Executors.newFixedThreadPool(10);

    private static final Logger logger = LoggerFactory.getLogger(CustomWebApplicationServer.class);

    public CustomWebApplicationServer(int port) {
        this.port = port;
    }


    public void start() throws IOException {
        try(ServerSocket serverSocket = new ServerSocket(port)) {
            logger.info("[CustomWebApplicationServer] started {} port.", port);

            Socket clientSocket;
            logger.info("[CustomWebApplicationServer] waiting for client.");

            while ((clientSocket = serverSocket.accept()) != null) {
                logger.info("[CustomWebApplicationServer] client connected!");

                executorService.execute(new ClientRequestHandler(clientSocket));
//                new Thread(new ClientRequestHandler(clientSocket)).start();



            }
        }
    }
}
