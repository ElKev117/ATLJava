package Model;

public class Pregunta {
    Categorie categoria;
    String pregunta;

    String[] opciones;

    String explicacion;

    int answer;

    public Pregunta() {
    }

    public Pregunta(Categorie categoria, String pregunta, String[] opciones, int answer, String explicacion) {
        this.categoria = categoria;
        this.pregunta = pregunta;
        this.opciones = opciones;
        this.answer = answer;
        this.explicacion = explicacion;
    }

    public Categorie getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorie categoria) {
        this.categoria = categoria;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String[] getOpciones() {
        return opciones;
    }

    public void setOpciones(String[] opciones) {
        this.opciones = opciones;
    }

    public String getExplicacion() {
        return explicacion;
    }

    public void setExplicacion(String explicacion) {
        this.explicacion = explicacion;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
