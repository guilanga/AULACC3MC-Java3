import java.time.Year;
import java.util.Random;

public class Aluno {
    
    private static int quantidadeAlunos = 0;
    
    private String matricula;
    private String nome;
    private String curso;
    private String turma;
    private int periodo;
    private double nota1B;
    private double nota2B;
    private double notaFinal;
    
    public Aluno() {
        this.matricula = gerarMatricula();
        quantidadeAlunos++;
    }
    
    public Aluno(String nome, String curso, String turma, int periodo, double nota1B, double nota2B) {
        this.nome = nome.toUpperCase();
        this.curso = curso;
        this.turma = turma;
        this.periodo = periodo;
        this.nota1B = nota1B;
        this.nota2B = nota2B;
        quantidadeAlunos++;
        calcularFinal();
        
    }
    
    private String gerarMatricula() {
        int ano = Year.now().getValue();
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(10000);
        return ano+String.format("%04d", numeroAleatorio);
    }
    
    private void calcularFinal() {
        this.notaFinal = (this.nota1B+this.nota2B)/2;
    }
    
    public boolean passar(String novaTurma, int novoPeriodo) {
        if(this.notaFinal>=7) {
            this.turma = novaTurma;
            this.periodo = novoPeriodo;
            return true;
        }
        System.out.println("Reprovado.");
        return false;
    }
    
    public void imprimir() {
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Nome: "+this.nome);
        System.out.println("Curso: "+this.curso);
        System.out.println("Turma: "+this.turma);
        System.out.println("Periodo: "+this.periodo);
        System.out.println("Nota 1B: "+this.nota1B);
        System.out.println("Nota 2B: "+this.nota2B);
        System.out.println("Nota Final: "+this.notaFinal);
    }
    
    @Override
    public String toString() {
        return "Matricula: "+this.matricula+"\n"
        +"Nome: "+this.nome+"\n"
        +"Curso: "+this.curso+"\n"
        +"Turma: "+this.turma+"\n"
        +"Periodo: "+this.periodo+"\n"
        +"Nota 1B: "+this.nota1B+"\n"
        +"Nota 2B: "+this.nota2B+"\n"
        +"Nota Final: "+this.notaFinal;
    }
    
    public static int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public String getCurso() {
        return curso;
    }
    
    public String getTurma() {
        return matricula;
    }
    
    public int getPeriodo() {
        return periodo;
    }
    
    public double getNota1B() {
        return nota1B;
    }
    
    public double getNota2B() {
        return nota2B;
    }
    
    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void setNota1B(double nota1B) {
        this.nota1B = nota1B;
    }

    public void setNota2B(double nota2B) {
        this.nota2B = nota2B;
        calcularFinal();
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    
    public void setTurma(String turma) {
        this.turma = turma;
    }


}
