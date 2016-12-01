/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author mathe
 */
public final class Bolsista extends Aluno{
    private float bolsa;
    
    public void RenovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }
    
    @Override
    public void PagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
