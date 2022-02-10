package patrick;

import patrick.core.Formatter;
import patrick.entity.Car;
import patrick.entity.InputJson;
import patrick.entity.OutputJson;

import java.io.IOException;

public class JsonApplication {

    /*
    [4:32 PM] Ronald Hernandez Cisneros

    Escriba un servicio que reciba un documento JSON que específica un texto a procesar y
    un token de búsqueda, de tal forma que el servicio encuentra todas las instancias donde se
    encuentra el token dentro del texto y retorna un documento JSON de vuelta indicando
    el total de ocurrencias y por cada línea del texto el índice donde se encuentra cada ocurrencia.

    Ejemplo:
        Si buscamos el token "re" en el siguiente texto (notese que es un texto en diferentes líneas)
        "
        Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
        Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
        Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
        Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
        "

        '\n'

        Podemos darnos cuenta que hay 7 ocurrencias:
        Línea #1: indice 2, 97, 107
        Línea #2: indice 110, 122, 125
        Línea #3: indice 35
        Línea #4: indice ninguna ocurrencia

        Formato de entrada JSON:
        {
            "text": "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad\nminim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit\nin voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia\ndeserunt mollit anim id est laborum.",
            "token": "re"
        }

        Formato de salida JSON:
        {
            "occurrences": {
                "Line 1": [2, 97, 107],
                "Line 2": [110, 122, 125],
                "Line 3": [35],
                "Line 4": []
                },
            "total_occurrences": 7
        }
     */
    public static void main(String[] args) {
        JsonApplication jsonApplication = new JsonApplication();
        jsonApplication.test();
    }

    public void test() {
        Formatter formatter = new Formatter();
        InputJson inputJson = null;
        try {
            inputJson = formatter.readInput("target/ejercicio.json");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        /*
        if (inputJson != null) {
            System.out.println(inputJson.toString());
        }


        for (String s : inputJson.getLines()) {
            System.out.println(s);
        }
         */

        OutputJson outputJson = new OutputJson();
        int counter = 0;
        int[] indexes =
        for (String s : inputJson.getLines()) {
            //s.matches(inputJson.getToken())
            for (int i = 0; i < s.toCharArray().length; i++) {
                if (s.charAt(i) == inputJson.getToken().charAt(0)) {
                    if (s.substring(i, i + inputJson.getToken().length()).equals(inputJson.getToken().length())) {
                        counter++;
                    }
                }
                outputJson.addLine(s, );
                counter = 0;
            }
        }



    }

    /*
    public void testObjToJson() {
        System.out.println("\n-- Parse Object to JSON Start --");
        Car car = new Car("Nissan", "Blue");
        String path = "target/car.json";

        try {
            Formatter.objToJson(car, path);
        }catch (IOException ioException) {
            // IO File format error
            ioException.printStackTrace();
        } catch (Exception exception) {
            // Unknown error
            exception.printStackTrace();
        }
        System.out.println("File written to path: " + path);
        System.out.println("-- Parse Object to JSON End --");
    }

    public void testJsonToObj() {
        System.out.println("\n-- Parse JSON to Object Start --");
        Car car = null;
        try {
            car = Formatter.jsonToObj("target/car.json");
        }catch (IOException ioException) {
            // IO File format error
            ioException.printStackTrace();
        } catch (Exception exception) {
            // Unknown error
            exception.printStackTrace();
        }
        System.out.println(car.toString());
        System.out.println("-- Parse JSON to Object End --");
    }
     */
}
