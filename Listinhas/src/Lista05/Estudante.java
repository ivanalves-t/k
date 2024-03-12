package Lista05;

public class Estudante {
private String nome;
private String matricula;
private String endereco;
private double [] notas;

public Estudante(String nome, String matricula, String endereco, double[] notas) {
	super();
	this.nome = nome;
	this.matricula = matricula;
	this.endereco = endereco;
	this.notas = notas;
}

public String getNome() {
	return nome;
}
public String getMatricula() {
	return matricula;
}
public String getEndereco() {
	return endereco;
}
public double[] getNotas() {
	return notas;
}
}
