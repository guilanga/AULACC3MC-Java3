public class Main
{
	public static void main(String[] args) {
		System.out.println("ALUNO");
		
		Aluno a1 = new Aluno();
		//System.out.println("Matrícula: "+ a1.getMatricula());
		a1.setNome("Abrantes");
		a1.setCurso("Medicina");
		a1.setTurma("MM1");
		a1.setPeriodo(1);
		a1.setNota1B(10);
		a1.setNota2B(10);
        a1.imprimir();
	}
}
