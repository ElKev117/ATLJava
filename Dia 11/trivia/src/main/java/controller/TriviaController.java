package controller;

import Model.Categorie;
import Model.Pregunta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TriviaController {

    @GetMapping("/question/{categoria}")
    public Pregunta getQuestion(@PathVariable String categoria){

        String[] opciones = {"De su hijo", "De él mismo", "De su hermano"};
        Categorie cat=null;
        if (categoria.equals(getCategorie()[0])){
            cat =getCategorie()[0];
        }else if (categoria.equals(getCategorie()[1])){
            cat =getCategorie()[1];
        }else if (categoria.equals(getCategorie()[2])){
            cat =getCategorie()[2];
        }else if (categoria.equals(getCategorie()[3])){
            cat =getCategorie()[3];
        }else if (categoria.equals(getCategorie()[4])){
            cat =getCategorie()[4];
        }else if (categoria.equals(getCategorie()[5])){
            cat =getCategorie()[5];
        }
        Pregunta pregunta = new Pregunta(cat,"Un hombre mira una foto y dice: 'Hermanos y hermanas no tengo, pero el padre de este hombre es el hijo de mi padre'. ¿De quién es la foto?",opciones,0,"De su hijo, ya que si es el hijo de su padre es el o sus hermanos, pero desde el inicio se especifica que no tiene hermanos.");

        return pregunta;
    }
    @GetMapping("/categories")
    public Categorie[] getCategorie() {

        Categorie categorie = new Categorie("Geografía","Preguntas relacionadas localizaciones de algún país o alguna cápital.");
        Categorie categorie1 = new Categorie("Literatura","Preguntas relacionadas con algún libro, título u autor.");
        Categorie categorie2 = new Categorie("Historia","Preguntas relacionadas con eventos importantes del pasado que marcarón un antes y un después en la humanidad.");
        Categorie categorie3 = new Categorie("Videojuegos","Preguntas relacionadas con algo de videojuegos, ya sea título o algún nombre de personajes.");
        Categorie categorie4 = new Categorie("Matemáticas","Preguntas relacionadas con alguna ecuación matemática simple.");
        Categorie categorie5 = new Categorie("Lógica", "Preguntas relacionadas con diferentes una rama de la ciencia, la lógica, usualmente algo similar a un acertijo.");
        Categorie[] categories = {categorie,categorie1,categorie2,categorie3,categorie4,categorie5};

        return categories;
    }
    @GetMapping("/hola")
    public String holaMundo(){
        return "Hola Mundo";
    }
}
