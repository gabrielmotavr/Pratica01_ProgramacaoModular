public class Aluno {
    private String nome;
    private int idade;
    private double coragem;
    private double inteligencia;
    private double ambicao;
    private double lealdade;
    private double estrategia;
    private double criatividade;
    private String casa;

    /*public Aluno(String nome, int idade, double coragem, double inteligencia, double ambicao, double lealdade, double estrategia, double criatividade){
        this.setNome(nome);
        this.setIdade(idade);
        this.setCoragem(coragem);
        this.setInteligencia(inteligencia);
        this.setAmbicao(ambicao);
        this.setLealdade(lealdade);
        this.setEstrategia(estrategia);
        this.setCriatividade(criatividade);
    }*/




    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public double getCoragem() {
        return coragem;
    }
    public void setCoragem(double coragem){
        this.coragem = coragem;
    }
    public double getInteligencia() {
        return inteligencia;
    }
    public void setInteligencia(double inteligencia){
        this.inteligencia = inteligencia;
    }
    public double getAmbicao() {
        return ambicao;
    }
    public void setAmbicao(double ambicao){
        this.ambicao = ambicao;
    }
    public double getLealdade() {
        return lealdade;
    }
    public void setLealdade(double lealdade){
        this.lealdade = lealdade;
    }
    public String getCasa() {
        return casa;
    }
    public void setCasa(String casa){
        this.casa = casa;
    }
    public double getEstrategia(){
        return this.estrategia;
    }
    public void setEstrategia(double estrategia) {
        this.estrategia = estrategia;
    }
    public double getCriatividade(){
        return this.criatividade;
    }
    public void setCriatividade(double criatividade) {
        this.criatividade = criatividade;
    }




    public String exibirInformacoes(){
        return "Nome: %s\n Idade: %d\n Coragem: %.2f\n Inteligência: %.2f\n Ambição: %.2f\n Lealdade: %.2f\n  Estrategia: %.2f\n Criatividade: %.2f\n Casa: %s"
                .formatted(this.getNome(), this.getIdade(), this.getCoragem(), this.getInteligencia(), this.getAmbicao(), this.getLealdade(), this.getEstrategia(), this.getCriatividade(), this.getCasa() == null ? "Sem casa" : this.getCasa());
    }

    public String calcularCasa() {
        double grifinoria = (2 * this.coragem) + this.lealdade;
        double sonserina = (2 * this.ambicao) + this.estrategia;
        double corvinal = (2 * this.inteligencia) + this.criatividade;
        double lufaLufa = ((2 * this.lealdade) + (this.coragem)) + 3;
        String maior = "" ;

        if (grifinoria > sonserina && grifinoria > corvinal && grifinoria > lufaLufa) {
            maior += "grifinoria";
        } else if (sonserina > grifinoria && sonserina > corvinal && sonserina > lufaLufa) {
            maior += "sonserina";
        } else if (corvinal > grifinoria && corvinal > sonserina && corvinal > lufaLufa) {
            maior += "corvinal";
        } else if (lufaLufa > grifinoria && lufaLufa > sonserina && lufaLufa > corvinal) {
            maior += "lufaLufa";
        }
        return maior;

    }

}
