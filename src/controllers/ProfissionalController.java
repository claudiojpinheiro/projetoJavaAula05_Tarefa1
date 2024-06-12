package controllers;

import java.util.Scanner;

import entities.Profissional;
import repositories.ProfissionalRepository;

public class ProfissionalController {

	public void cadastarProfissional() { 
		
		Scanner scanner = new Scanner(System.in);
	try

	{

		Profissional profissional = new Profissional();

		System.out.println("#####CADASTRO DE PROFISSIONAIS#####");

		System.out.println("ID DO FUNCIONARIO: ");
		profissional.setId(Integer.parseInt(scanner.nextLine()));
		
		System.out.println("NOME DO FUNCIONARIO: ");
		profissional.setNome(scanner.nextLine());
		
		System.out.println("EMAIL DO FUNCIONARIO: ");
		profissional.setEmail(scanner.nextLine());
		
		System.out.println("TELEFONE DO FUNCIONARIO: ");
		profissional.setTelefone(scanner.nextLine());
		
		System.out.println("ESPECIALIZACAO DO FUNCIONARIO: ");
		profissional.setEspecializacao(scanner.nextLine());
		
		ProfissionalRepository profissionalRepository = new ProfissionalRepository();
		profissionalRepository.insert(profissional);
		
		System.out.println("\nPROFISSIONAL CADASTRADO COM SUCESSO!");
		

	}catch(Exception e){
		System.out.println("ERRO" + e.getMessage());
	}finally{
		scanner.close();
	}
	
}}