package com.FemCoders.Lean.Mean.Text.Machine.Controller;

import com.FemCoders.Lean.Mean.Text.Machine.Model.Phrase;
import com.FemCoders.Lean.Mean.Text.Machine.service.PhraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/phrases")
public class PhraseController {

    private final PhraseService phraseService;

    @Autowired
    public PhraseController(PhraseService phraseService) {
        this.phraseService = phraseService;
    }

    @GetMapping
    public List<Phrase> getAllPhrases() {
        return phraseService.getAllPhrases();
    }

    @GetMapping("/{id}")
    public Phrase getPhraseById(@PathVariable Long id) {
        return phraseService.getPhraseById(id)
                .orElseThrow(() -> new RuntimeException("Phrase not found with id: " + id));
    }

    @PostMapping
    public Phrase createPhrase(@RequestBody Phrase phrase) {
        return phraseService.savePhrase(phrase);
    }

    @PutMapping("/{id}")
    public Phrase updatePhrase(@PathVariable Long id, @RequestBody Phrase updatedPhrase) {
        return phraseService.updatePhrase(id, updatedPhrase);
    }

    @DeleteMapping("/{id}")
    public void deletePhrase(@PathVariable Long id) {
        phraseService.deletePhrase(id);
    }
}
