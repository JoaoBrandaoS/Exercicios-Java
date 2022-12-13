package PooSegundoExercicio;

public class escola {
    
   private String aluno,sala;
   private double nota,media;

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota += nota;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media,int divide) {
        this.media = media/divide;
    } 


}
