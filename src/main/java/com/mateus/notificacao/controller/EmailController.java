package com.mateus.notificacao.controller;

import com.mateus.notificacao.business.EmailService;
import com.mateus.notificacao.business.dto.TarefasDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/email")
public class EmailController {

    private final EmailService emailService;

    @PostMapping
    public ResponseEntity<Void> enviarEmail(@RequestBody TarefasDTO tarefasDTO) {
        emailService.enviaEmail(tarefasDTO);
        return ResponseEntity.ok().build();
    }

}
