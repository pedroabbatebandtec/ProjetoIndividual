package br.com.bandtec.projetoindividual;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/mercadinho")
public class MercadinhoController {
    private List<MargemDeLucro> lista = new ArrayList<>();

    @GetMapping("/produtos")
    public List<MargemDeLucro> getProdutos(){
        return lista;
    }

    @PostMapping("/padaria")
    public void adicionarPadaria(@RequestBody Padaria padaria){
        lista.add(padaria);
    }

    @PostMapping("/cosmetico")
    public void adicionarCosmetico(@RequestBody Cosmeticos cosmetico){
        lista.add(cosmetico);
    }

    @GetMapping("/busca/{id}")
    public MargemDeLucro getProduto(@PathVariable int id){
        return lista.get(id-1);
    }
    
    @DeleteMapping("/produto/{id}")
    public void deletarProduto(@PathVariable int id){
        lista.remove(id-1);
    }
}
