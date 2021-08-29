package edu.eci.arsw.blueprints;

import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.services.BlueprintsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {
    @Autowired
    BlueprintsServices bps;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... arg0) throws Exception {
        int times = 5;
        String author = "Juan";
        System.out.println("Añadiendo "+times+" Planos asociados al autor"+ author);
        for ( int x = 0; x < times; x++){
            bps.addNewBlueprint(new Blueprint(author, "Airetupal"+x));
        }
        System.out.println("Se añadieron " + bps.getBlueprintsByAuthor(author).size() +" Planos del autor "+ author);
        System.out.println("Consultando plano Airetupal0 del  autor "+author);
        System.out.println("El plano encontrado es"+ bps.getBlueprint(author,"Airetupal0"));
    }
}
