package com.example.digitalmycloudhealth.configs;

import com.example.digitalmycloudhealth.models.UsuarioModel;
import com.example.digitalmycloudhealth.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.time.LocalDate;

public class DatabaseSeeder implements CommandLineRunner {

    @Autowired
    UsuarioRepository usuarioRepository;

   @Override
    public void run (String... args) throws Exception{

       UsuarioModel usuarioModel = new UsuarioModel();
       usuarioModel.setEmail("fulanodetal@gmail.com");
       usuarioModel.setNome("Fulano");
       usuarioModel.setSobrenome("de Tal");
       usuarioModel.setSenha("120120");
       usuarioModel.setCpf("556.816.940-38");
       usuarioModel.setDataNascimento(LocalDate.of(1990, 10, 15));
       usuarioModel.setPeso(50.00);
       usuarioModel.setAltura(1.75);
       usuarioModel.setSexo("Masculino");

   }




}
