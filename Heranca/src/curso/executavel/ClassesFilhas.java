package curso.executavel;

import subclasses.Aluno;
import subclasses.Diretor;
import subclasses.Secretario;

public class ClassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Rai Aragão");
		aluno.setIdade(22);

		Diretor diretor = new Diretor();
		diretor.setNomePai("Chuck");
		diretor.setIdade(50);

		Secretario secretario = new Secretario();
		secretario.setIdade(40);

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

		System.out.println(aluno.pessoaMaiorIdade() + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("O salário do aluno é de: "+ aluno.salario());
		System.out.println("O salário do diretor é de: "+ diretor.salario());
		System.out.println("O salário do secretário é de: "+ secretario.salario());
	}

}
