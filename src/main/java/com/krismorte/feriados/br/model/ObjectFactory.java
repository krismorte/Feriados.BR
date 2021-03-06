

package com.krismorte.feriados.br.model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.krismorte.feriados.br.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.krismorte.feriados.br.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Events }
     * 
     * @return 
     */
    public Events createEvents() {
        return new Events();
    }

    /**
     * Create an instance of {@link Location }
     * 
     * @return 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link Event }
     * 
     * @return 
     */
    public Event createEvent() {
        return new Event();
    }

}
