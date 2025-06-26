package lista1;

import java.util.Scanner;

public class Aluno {
	String nome;
	String curso;
	int matricula;
	String[] disciplina =  new String[3];
	float[] notas = new float[3];
	
	Scanner scan = new Scanner(System.in);
	
	void entradaDados() {
	System.out.println("Digite o nome do aluno: ");
	this.nome = scan.nextLine();
	System.out.println("Digite o curso: ");
	this.curso = scan.nextLine();
	System.out.println("Digite a matricula:");
	this.matricula = scan.nextInt();
	scan.nextLine();
	
	for(int i = 0;i < this.disciplina.length; i++) {
		System.out.println("Digite o nome da disciplina " + (i + 1) + ":");
		disciplina[i] = scan.nextLine();
	}
		
	for(int i = 0;i < this.notas.length; i++) {
		System.out.println("Digite a nota da disciplina " + (i + 1) + ":");
		notas[i] = scan.nextFloat();
	}
	}
	void status() {
		System.out.println("Disciplina " + disciplina[0] + ": ||  Nota: " + notas[0]);
		System.out.println("Disciplina " + disciplina[1] + ": ||  Nota: " + notas[1]);
		System.out.println("Disciplina " + disciplina[2] + ": ||  Nota: " + notas[2]);
	}
	void aprovacao() {
		if(notas[0] >= 7) {
			System.out.println("Aluno APROVADO");
		}
		else {
			System.out.println("Aluno REPROVADO!");
		}
		if(notas[1] >= 7) {
			System.out.println("Aluno APROVADO");
		}
		else {
			System.out.println("Aluno REPROVADO!");
		}
		if(notas[2] >= 7) {
			System.out.println("Aluno APROVADO");
		}
		else {
			System.out.println("Aluno REPROVADO!");
		}
	}
}