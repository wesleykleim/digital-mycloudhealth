package com.example.digitalmycloudhealth.controllers;

import com.example.digitalmycloudhealth.models.UsuarioModel;
import com.example.digitalmycloudhealth.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping
    public List<UsuarioModel> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<UsuarioModel> getUsuarioById(@PathVariable Integer id) {
        return usuarioRepository.findById(id);
    }

    @PostMapping
    public UsuarioModel createUsuario(@RequestBody UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    @PutMapping("/{id}")
    public UsuarioModel updateUsuario(@PathVariable Integer id, @RequestBody UsuarioModel newUsuario) {
        return usuarioRepository.findById(id)
                .map(usuario -> {
                    usuario.setEmail(newUsuario.getEmail());
                    usuario.setNome(newUsuario.getNome());
                    // Adicione outras atualizações conforme necessário
                    return usuarioRepository.save(usuario);
                })
                .orElseGet(() -> {
                    newUsuario.setId(id);
                    return usuarioRepository.save(newUsuario);
                });
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Integer id) {
        usuarioRepository.deleteById(id);
    }

    @GetMapping("/byEmail")
    public Optional<UsuarioModel> getUsuarioByEmail(@RequestParam String email) {
        return usuarioRepository.findByEmail(email);
    }
}
