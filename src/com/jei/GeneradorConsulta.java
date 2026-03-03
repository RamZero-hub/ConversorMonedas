package com.jei;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GeneradorConsulta {
    public Monedas ConsultaConConvertir(String monedaInicial,String monedaFinal){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el valor a convertir: ");
        double valorCantidad;
        valorCantidad = scanner.nextDouble();

        String apiKey = System.getenv("EXCHANGE_API_KEY");
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" +
                apiKey + "/pair/" + monedaInicial + "/"+ monedaFinal +"/"+valorCantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        ///
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Monedas resultado = new Gson().fromJson(response.body(), Monedas.class);

            System.out.println("RESULTADO:");
            System.out.println("El valor de [ " + valorCantidad +" "+ monedaInicial + " ] " +
                    "es igual a: [ " + resultado.conversion_result() + " "+ monedaFinal + " ] ");
            System.out.println("TRM = "+ resultado.conversion_rate());

            return resultado;

        } catch (Exception e) {
            throw new RuntimeException("No es posible generar la conversion, verifique lo digitado");
        }
        ///

    }

}
