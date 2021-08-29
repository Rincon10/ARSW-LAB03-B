package edu.eci.arsw.blueprints;

import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.persistence.BlueprintNotFoundException;
import edu.eci.arsw.blueprints.persistence.BlueprintPersistenceException;
import edu.eci.arsw.blueprints.services.BlueprintsServices;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main  {

    static BlueprintsServices bps;

    public static void main(String[] args) throws BlueprintPersistenceException, BlueprintNotFoundException {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        bps =ac.getBean(BlueprintsServices.class);

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
