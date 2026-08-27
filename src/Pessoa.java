public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private float altura;
    private double peso;
    private double imc;

    public void pessoa(String nome, String sobrenome, int idade, float altura, double peso, double imc){
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
        setPeso(peso);
        setImc(imc);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getImc() {
        return imc;
    }
    public void setImc(double imc){
        this.imc = imc;
    }

    public double calcularImc(float altura, double peso){
        double denominador = altura * altura;
        //if(denominador == 0)return;
        return peso / denominador;
    }

    public String informaObesidade(double imc){
        if(imc < 18.5){
            return "Abaixo do peso";
        }else if(imc < 24.9){
            return "Peso normal";
        }else if(imc < 29.9){
            return "Sobrepeso";
        }else if(imc < 34.9){
            return "Obesidade grau 1";
        }else if(imc < 39.9){
            return "Obesidade grau 2";
        }
        return "";
    }

}