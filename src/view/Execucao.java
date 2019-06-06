package view;

import javax.swing.JOptionPane;

import model.Professor;

public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor professor = new Professor();
		
		professor.setNome(JOptionPane.showInputDialog(null,"Nome: "));
		professor.setEndereco(JOptionPane.showInputDialog(null,"Endereço: "));
		professor.setBairro(JOptionPane.showInputDialog(null,"Bairro: "));
		professor.setCep(JOptionPane.showInputDialog(null,"Cep: "));
		professor.setCidade(JOptionPane.showInputDialog(null,"Cidade: "));
		professor.setEstado(JOptionPane.showInputDialog(null,"Estado: "));
		professor.setRg(JOptionPane.showInputDialog(null,"RG: "));
		professor.setCpf(JOptionPane.showInputDialog(null,"CPF: "));
		
		try {
			int dis = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas disciplinas você possui?"));
			String disciplinas[] = new String[100];
			int cont=0;
			for (int i=0;i < dis; i++) {
				cont+=1;
				disciplinas[i] = JOptionPane.showInputDialog(null, "Digite a disciplina " + cont);
			}
			professor.setDisciplinas(disciplinas);
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			int cur = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas cursos você possui?"));
			String cursos[] = new String[100];
			int cont=0;
			for (int i=0;i<cur;i++) {
				cont+=1;
				cursos[i] = JOptionPane.showInputDialog(null, "Digite o cursos " + cont);
			}
			professor.setCursos(cursos);
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(professor.getNome());
		System.out.println(professor.getEndereco());
		System.out.println(professor.getBairro());
		System.out.println(professor.getCep());
		System.out.println(professor.getCidade());
		System.out.println(professor.getEstado());
		System.out.println(professor.getRg());
		System.out.println(professor.getCpf());
		
		
		
	}

}
