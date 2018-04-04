package factory;

import heirs.FileWriter;
import heirs.XMLWriter;
import parentClasses.AbstractWriter;

import javax.swing.text.Document;
import java.io.File;

public class Factory {
    public AbstractWriter getWriter(Object object){
        AbstractWriter writer = null;
        if (object instanceof File){
            writer = new FileWriter();
        } else if (object instanceof Document){
            writer = new XMLWriter();
        }
        return writer;
    }
}
