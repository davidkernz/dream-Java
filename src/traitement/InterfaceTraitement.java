package traitement;

import java.util.ArrayList;

public interface InterfaceTraitement <T>{
    void enregistrer(T e);
    void afficher();
    void modifier(T m);
    void supprimer(String id);
    ArrayList<T> getAll();
    T getFromId(String id);
    
}
