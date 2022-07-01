/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.frank.consumirwebservice;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.frank.consumirwebservice.api.dto.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;

/**
 *
 * @author Frank
 */
@WebServlet(value = "/Users")
public class UserServlet extends HttpServlet {

    private static final String POST_API_URL = "http://localhost:8080/testJava17/api/user";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        try {
            req.setAttribute("users", getAll());
            req.setAttribute("user", getOne(1L));
            req.setAttribute("update", update(new User(2L, "Rolando", "Jacinto", "rolaJacintoNick", "rolax@outlook.com", "admin123")));
            req.setAttribute("create", create(new User(null,"Angela","Garcia","AngelinaC","angela@outlook.com","admin789")));
            req.setAttribute("delete", delete("3"));
            
            req.getRequestDispatcher("user/user-page.jsp").forward(req, res);
        } catch (InterruptedException ex) {
            System.out.println("Error al consumir web service");
            res.sendRedirect("index.jsp");
        }
    }

    private List<User> getAll() throws IOException, InterruptedException {
        List<User> users = null;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("accept", "application/json")
                .uri(URI.create(POST_API_URL))
                .build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        //System.out.println(response.body());
        //Implementaicon JSON
        ObjectMapper mapper = new ObjectMapper();
        users = mapper.readValue(response.body(), new TypeReference<List<User>>() {
        });
        //users.forEach(System.out::println);
        return users;
    }

    private User getOne(Long id) throws IOException, InterruptedException {
        User user = null;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("accept", "application/json")
                .uri(URI.create(POST_API_URL + "/" + id))
                .build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        //System.out.println(response.body());
        //Implementaicon JSON
        ObjectMapper mapper = new ObjectMapper();
        user = mapper.readValue(response.body(), new TypeReference<User>() {
        });
        //users.forEach(System.out::println);
        return user;
    }

    private boolean update(User entity) throws IOException, InterruptedException {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String requestBody = objectMapper
                    .writeValueAsString(entity);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .PUT(HttpRequest.BodyPublishers.ofString(requestBody))
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/json")
                    .uri(URI.create(POST_API_URL))
                    .build();
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            System.out.println("respuesta: " + response.body());
            //Implementaicon JSON
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(response.body(), new TypeReference<Boolean>() {
            });
        } catch (Exception ex) {
            System.out.println("Error.Api.Update:" + ex);
            return false;
        }
    }

    private boolean create(User entity) throws IOException, InterruptedException {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String requestBody = objectMapper
                    .writeValueAsString(entity);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/json")
                    .uri(URI.create(POST_API_URL))
                    .build();
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            System.out.println("respuesta: " + response.body());
            //Implementaicon JSON
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(response.body(), new TypeReference<Boolean>() {
            });
        } catch (Exception ex) {
            System.out.println("Error.Api.Update:" + ex);
            return false;
        }
    }
    private boolean delete(String id) throws IOException, InterruptedException {
        try {

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .DELETE()
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/json")
                    .uri(URI.create(POST_API_URL+"/"+id))
                    .build();
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            System.out.println("respuesta: " + response.body());
            //Implementaicon JSON
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(response.body(), new TypeReference<Boolean>() {
            });
        } catch (Exception ex) {
            System.out.println("Error.Api.Update:" + ex);
            return false;
        }
    }
    /*METODO HTTPURLCONNECTION
    private static HttpURLConnection connection;
    
    -->En funcion
    BufferedReader reader;
    String line;
    StringBuffer responseContent = new StringBuffer();
    --> en try catch
    URL url = new URL("https//miwebservice.com/servicio");
    connection = (cast) url.openConnection();
    
    //requets setup
    connection.setRequestMethod("GET");
    connection.setConnectionTimeout(5000); //milisegundos
    connection.setRealTimeout(5000);
    int status = connection.getResponseCode(); //return status
    if(status > 299){ //errores
        reader = new BufferedReader(new InputStreamReader(connection.getErrorAtream()));
        while((line = reader.readLine())!= null){
            responseContent.append(line);
        }
        reader.close()
    }else{
        reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        while((line = reader.readLine())!= null){
            responseContent.append(line);
        }
        reader.close()
    }
    sout(responseContent.toString());
     --> en try catch
    -->finally -> close connection
    -->En funcion
     */
 /* Metodo 2: java.net.http.HttpClient
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request =  HttpRequest.newBuilder.uri(URI.create("peticion")).build();
    client.sendAsync(requets, HttpResponse.BodyHandlers.ofString())
    .thenApply(HttpResponse::body)
    .thenAcept(sout::sout)
    .join();
     */
}
