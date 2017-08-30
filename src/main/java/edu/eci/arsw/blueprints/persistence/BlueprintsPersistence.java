/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blueprints.persistence;

import edu.eci.arsw.blueprints.model.Blueprint;

/**
 *
 * @author hcadavid
 */
public interface BlueprintsPersistence {
    
    public void saveBlueprint(Blueprint bp) throws BlueprintPersistenceException;
    
    public Blueprint getBlueprint(String author,String bprintname) throws BlueprintNotFoundException;
    
}
