package models;

import com.orm.SugarRecord;

public class Book extends SugarRecord <Book> {
    String apellidos;
    String nombres;
    String foto;
    public Book(
            String apellidos,
            String nombres,
            String foto){
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.foto = foto;
    }

}
